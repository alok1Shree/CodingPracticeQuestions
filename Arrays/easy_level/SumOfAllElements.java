//Sum of Array Elements: Given an array A of integers, find the sum of all its elements.

package easy_level;

import java.util.Scanner;

public class SumOfAllElements {
    public static int allElementsSum(int[] arr){
        int sum=0;
        if(arr != null || arr.length>0){
            for (int j : arr) {
                sum += j;
            }
            return sum;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]= scan.nextInt();
        }
        System.out.println("Sum of arrays: "+allElementsSum(numbers));
    }

}
