//Copy Array: Given an array A, create a new array B and copy all elements from A to B.

package easy_level;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static int[] copyArray(int[] arr){
        int[] copyData = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copyData[i]=arr[i];
        }
        return copyData;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println("Data of A: "+ Arrays.toString(numbers));
        System.out.println("Copied Data from A to B: "+Arrays.toString(copyArray(numbers)));
    }
}
