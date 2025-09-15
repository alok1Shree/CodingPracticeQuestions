package Easy;

//- Determine whether a given integer array is sorted in ascending order (return true or false)

import java.util.Arrays;
import java.util.Scanner;

public class CheckSortedArray {
    //1 2 3 4 5 6 7 -> true
    //7 3 4 1 4 5 8 -> false

    public static boolean checkSortedArray(int[] arr){
        boolean isSorted = true;

        int previous = arr[0];
        for(int current:arr){
            if(current == arr[0]){
                continue;
            }
            if(current<previous){
                return false;
            }
            previous = current;
        }
        return isSorted;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Input Array: "+Arrays.toString(arr));
        System.out.println("Is sorted Array: "+checkSortedArray(arr));
    }

}
