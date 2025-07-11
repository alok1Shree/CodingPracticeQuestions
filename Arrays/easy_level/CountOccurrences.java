//Count Occurrences: Given an array A and a target value X, count how many times X appears in A.

package easy_level;

import java.util.Scanner;

public class CountOccurrences {
    public static int countOccurrences(int[] arr, int searchItem){
        int count=0;
        for(int number:arr){
            if(searchItem==number){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int size = scan.nextInt();
        int numbers[] = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        int searchElement = scan.nextInt();
        System.out.println("Count of number occurrences: "+countOccurrences(numbers,searchElement));
    }
}
