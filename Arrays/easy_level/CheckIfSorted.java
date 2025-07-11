//Check if Sorted (Ascending): Given an array A, determine if it is sorted in ascending order.

package easy_level;

import java.util.Scanner;

public class CheckIfSorted {
    public static boolean isSortedAscending(int[] arr){
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println("Is value sorted: "+isSortedAscending(numbers));
    }
}
