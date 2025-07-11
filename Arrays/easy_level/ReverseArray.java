//Reverse an Array: Given an array A, create a new array with the elements of A in reverse order.

package easy_level;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static int[] reverseArray(int[] arr){
        int[] revArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            revArr[i]=arr[arr.length-1-i];
        }
        return revArr;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println("Before Array reversed: "+Arrays.toString(numbers));
        System.out.println("Reverse Array: "+ Arrays.toString(reverseArray(numbers)));
    }
}
