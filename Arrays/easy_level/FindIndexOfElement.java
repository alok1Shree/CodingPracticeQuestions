//Find Index of Element: Given an array A and a target value X, find the first index at which X appears. If not found, return -1.

package easy_level;

import java.util.Scanner;

public class FindIndexOfElement {
    public static int findIndexValue(int[] arr, int searchValue){
        int index=0;
        for(int number:arr){
            if(searchValue==number)
                return index;
            index++;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        int searchElemet = scan.nextInt();
        System.out.println("Index of searchElement "+searchElemet+" : "+findIndexValue(numbers,searchElemet));
    }
}
