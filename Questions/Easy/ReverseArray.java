package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static int[] reverseArr(int[] arr){
        int[] reverse = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            reverse[i] = arr[arr.length-1-i];
        }
        return reverse;
    }

    public static void main(String[] args){
        int[] providedArray = {1,2,3,4,5,6,7};
        Scanner scanner = new Scanner(System.in);
        int arrLenght = scanner.nextInt();
        int[] arr = new int[arrLenght];
        for(int i=0;i<arrLenght;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input Array: "+Arrays.toString(arr));
        System.out.println("Reversed Array: "+Arrays.toString(reverseArr(arr)));
    }
}

//Write a Java program to reverse a given integer array in place (output the array with its elements in reverse order).