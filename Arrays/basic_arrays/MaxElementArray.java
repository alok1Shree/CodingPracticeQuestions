package basic_arrays;

public class MaxElementArray {
    public static int maxElement(int[] arr){
        int tempVal = arr[0];
        for(int maxArr : arr){
            if(maxArr>tempVal){
                tempVal = maxArr;
            }
        }
        return tempVal;
    }
    public static void main(String[] args){
        int[] arr = {3,5,2,8,1};
        System.out.println("Max Element in arrays: "+maxElement(arr));
    }
}
