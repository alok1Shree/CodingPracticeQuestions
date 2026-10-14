import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueElement {
    public static void main(String[] args) {
        String str = "aacbdbcde";
        System.out.println(findFirstUniqueChar(str));
    }

    static char findFirstUniqueChar(String str) {
       char[] arr = str.toCharArray();
       Map<Character, Integer> map = new HashMap<>();
       for(char ch: arr){
           map.put(ch, map.getOrDefault(ch, 0)+1);
       }
       for(char ch: arr){
           if(map.get(ch)==1){
               return ch;
           }
       }

       return '-';

    }
}
