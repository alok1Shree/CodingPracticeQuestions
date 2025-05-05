package basic_arrays;

// Question: Calculate the sum of all elements in an array.
// Input: [1, 2, 3, 4, 5]
// Expected Output: 15

public class SumofAllElementsArray {
    public static int sumAllArray(int[] arr){
      int sum = 0;
      for(int sumAll:arr){
        sum+=sumAll;
      }
      return sum;
    }
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      System.out.println("Sum All: "+sumAllArray(arr));
    }
}
