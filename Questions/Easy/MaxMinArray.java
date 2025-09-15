package Easy;

import java.util.Scanner;


//- Find and print both the maximum and minimum values in an integer array input by the user.

public class MaxMinArray {
    public static void maxMinArray(int[] arr){
        // 2 3 6 9 1 0 5
//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;
        int maxValue = arr[0];
        int minValue = arr[0];
        for(int i:arr){
            if(i>maxValue){
                maxValue = i;
            }
            if(i<minValue){
                minValue = i;
            }
        }
        System.out.println("Min Value: "+minValue + " | " + "Max Value: "+maxValue);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arrLenght = scan.nextInt();
        int[] arr = new int[arrLenght];
        for(int i=0;i<arrLenght;i++){
            arr[i]=scan.nextInt();
        }
        maxMinArray(arr);
    }
}
