package Easy;

import java.util.Arrays;
import java.util.Scanner;

//- Calculate and print the sum of all elements in an integer array provided by the user.

public class SumOfArray {
    public static int sumofArray(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Input Array: "+ Arrays.toString(arr));
        System.out.println("Sum of Array: "+ Arrays.toString(new int[]{sumofArray(arr)}));
    }
}
