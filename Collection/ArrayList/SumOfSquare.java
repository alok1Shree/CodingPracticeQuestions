package ArrayList;

import java.util.Collections;
import java.util.List;

public class SumOfSquare {
    public static List<Integer> SumSquare(List<Integer> numbers){
        return Collections.singletonList(numbers.stream().map(num -> num * num).
                reduce(0, Integer::sum));
    }


}
