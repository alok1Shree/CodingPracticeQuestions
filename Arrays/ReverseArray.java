
import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArr(int[] arr){
        int[] tempVal = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            tempVal[i] = arr[arr.length-1-i];
        }
        return tempVal;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] revArr = reverseArr(arr);
        System.out.println("Reverse Array: "+Arrays.toString(revArr));
    }
}
