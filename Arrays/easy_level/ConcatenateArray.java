//Concatenate Two Arrays: Given two arrays A and B, create a new array C that contains all elements of A followed by all elements of B.

package easy_level;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateArray {
    public static int[] concatenateArray(int[] A, int[] B){
        int[] C = new int[A.length+B.length];
        int currentCIndex = 0;
        for(int i=0;i<A.length;i++){
            C[currentCIndex] = A[i];
            currentCIndex++;
        }
        for(int i=0;i<B.length;i++){
            C[currentCIndex]=B[i];
            currentCIndex++;
        }
        return C;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sizeA = scan.nextInt();
        int sizeB = scan.nextInt();
        int[] A = new int[sizeA];
        int[] B = new int[sizeB];
        for(int i=0;i<sizeA;i++){
            A[i] = scan.nextInt();
        }
        for(int i=0;i<sizeB;i++){
            B[i]= scan.nextInt();
        }
        System.out.println("A: "+Arrays.toString(A));
        System.out.println("B: "+Arrays.toString(B));
        System.out.println("Concatenate Array of A and B: "+ Arrays.toString(concatenateArray(A, B)));
    }
}
