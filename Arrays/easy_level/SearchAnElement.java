//Search for an Element: Given an array A and a target value X, determine if X is present in A. Return true or false.

package easy_level;

import java.util.Scanner;

public class SearchAnElement {
    public static boolean searchAnElement(int[] arr, int searchValue){
        for(int num:arr){
            if(searchValue==num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scan.nextInt();
        System.out.println("Enter Number: ");
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println("Enter searchElement: ");
        int searchElement = scan.nextInt();
        System.out.println("Search Element is present: "+searchAnElement(numbers,searchElement));
    }
}
