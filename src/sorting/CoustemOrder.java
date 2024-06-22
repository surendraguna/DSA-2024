package sorting;

import java.util.Collections;
import java.util.HashMap;

public class CoustemOrder {
    public static void main(String[] args) {
        String res = customSortString("cba", "abcd");
        System.out.println(res);
    }
    public static String customSortString(String o, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        String res = "";
        for(int i = 0; i < o.length(); i++){
            if(map.containsKey(o.charAt(i))){
                res = res + String.join("", Collections.nCopies(map.get(o.charAt(i)), String.valueOf(o.charAt(i))));
                map.remove(o.charAt(i));
            }
        }
        for(char c : map.keySet()) 
            res = res + String.join("", Collections.nCopies(map.get(c), String.valueOf(c)));
        return res;
    }
}
