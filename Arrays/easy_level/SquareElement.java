//Square Elements: Given an array A of integers, create a new array where each element is the square of the corresponding element in A.

package easy_level;

import java.util.Arrays;
import java.util.Scanner;

public class SquareElement {
    public static int[] squareElement(int[] arr){
        int[] squrArray = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            double sqrt = Math.pow(arr[i],2);
            squrArray[i]= (int) sqrt;
        }
        return squrArray;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println("Array: "+ Arrays.toString(numbers));
        System.out.println("Square of corresponding array: "+Arrays.toString(squareElement(numbers)));
    }
}
