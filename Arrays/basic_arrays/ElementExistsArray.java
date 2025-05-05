package basic_arrays;

//Question: Given an array and a target element, check if it exists.
//Input: [10, 20, 30, 40], Target = 30
//Expected Output: True

public class ElementExistsArray {
    public static boolean elementExist(int[] arr, int target){
        for(int element:arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 40;
        System.out.println("Does the element exist? " + elementExist(arr, target));
    }
}
