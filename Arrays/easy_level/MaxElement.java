//Find Maximum Element: Given an array A of integers, find the largest element.

package easy_level;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class MaxElement {
    public static int maxElement(int[] arr){
        int maxValue = arr[0];
        if(arr !=null||arr.length>0){
            for(int values:arr){
                if(values>maxValue){
                    maxValue=values;
                }
            }
            return maxValue;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println("Max value in an array: "+maxElement(numbers));
    }
}
