//Count Even/Odd Numbers: Given an array A of integers, count the number of even and odd elements.

package easy_level;

import java.util.Scanner;

public class CountEvenOdd {
    public static void countEvenOddNum(int[] arr){
        int evenCount = 0;
        int oddCount = 0;
        for(int number:arr){
            if(number%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
       System.out.println("EvenCount: "+evenCount+",\nOddCount: "+oddCount);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] number = new int[size];
        for(int i=0;i<size;i++){
            number[i]=scan.nextInt();
        }
        countEvenOddNum(number);
    }
}
