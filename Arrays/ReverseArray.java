public class ReverseArray {
    public static int reverseArr(int[] arr){
        int[] tempVal = new int[arr.length];
        for(int i=arr.length-1;i<=0;i--){
            tempVal = arr[i];
        }
        return tempVal;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Reverse Array: "+reverseArr(arr));
    }
}
