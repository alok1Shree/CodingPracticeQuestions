package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static List<Integer> FilterEvenNo(List<Integer> numbers){
        return numbers.stream().filter(num -> num%2 ==0 ).collect(Collectors.toList());
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> evenNumber = new ArrayList<>();
        int count = scan.nextInt();
        for(int i=0;i<count;i++){
            evenNumber.add(scan.nextInt());
        }
        System.out.println("Original List: "+evenNumber);
        List<Integer> filteredList = FilterEvenNo(evenNumber);
        System.out.println("Filtered Even Number List: "+filteredList);
    }
}
