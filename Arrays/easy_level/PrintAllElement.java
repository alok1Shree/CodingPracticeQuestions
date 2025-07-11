//Print Array Elements: Given an array A, print all its elements.

package easy_level;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAllElement {
    public static String allElement(int[] arr){
        return Arrays.toString(arr);
    }

    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = scan.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the number");
        for(int i=0; i<size; i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println("All Elements in array: "+allElement(numbers));
    }
}
