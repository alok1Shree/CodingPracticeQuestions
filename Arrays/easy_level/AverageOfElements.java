//Average of Array Elements: Given an array A of integers, find the average of its elements.

package easy_level;

import java.util.Scanner;

public class AverageOfElements {
    public static int allElementsAverage(int[] arr){
        int avg = 0;
        int sum = 0;
        if(arr != null||arr.length>0){
            for(int num:arr){
                sum += num;
                avg = sum/arr.length;
            }
            return avg;
        }
        return 0;
    }

    public static void main(String[] arr){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i] = scan.nextInt();
        }
        System.out.println("All elements Average: "+allElementsAverage(numbers));
    }
}
