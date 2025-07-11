//Find Minimum Element: Given an array A of integers, find the smallest element.

package easy_level;

import java.util.Scanner;

public class MinElement {
    public static int minElement(int[] arr){
        int minValue = arr[0];
        if(arr != null && arr.length>0){
            for(int values:arr){
                if(values<minValue)
                    minValue=values;
            }
            return minValue;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i] = scan.nextInt();
        }
        System.out.println("Min value in an array: "+minElement(numbers));
    }
}
