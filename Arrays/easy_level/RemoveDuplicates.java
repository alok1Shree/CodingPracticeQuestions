//Remove Duplicates (Simple): Given a sorted array A with duplicates, create a new array with only unique elements.
// (For unsorted, just focus on keeping the first occurrence).

package easy_level;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static int[] getUniqueArray(int[] arr){
        if(arr==null||arr.length==0){
            return new int[arr[0]];
        }
        if(arr.length==1){
            return new int[]{arr[0]};
        }
        int[] uniqueArray = new int[arr.length];
        int uniqueCount = 0;
        for(int i=0;i<arr.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<uniqueCount;j++){
                if(arr[i]==uniqueArray[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueArray[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        int[] resultArray = new int[uniqueCount];
        for(int i=0;i<uniqueCount;i++){
            resultArray[i]=uniqueArray[i];
        }
        return resultArray;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=scan.nextInt();
        }
        System.out.println("Original Array: "+ Arrays.toString(numbers));
        System.out.println("Unique Array: "+ Arrays.toString(getUniqueArray(numbers)));
    }
}
