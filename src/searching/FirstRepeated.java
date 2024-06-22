package searching;

import java.util.LinkedHashMap;
import java.util.Set;

public class FirstRepeated {
    public static void main(String[] args) {
        int a[] = {3, 2, 1, 2, 2, 3, 4, 5, 4};
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else
                map.put(a[i], 1);
        }

        Set<Integer> set = map.keySet();
        for(Integer s : set){
            System.out.println(s);
            break;
        }
    }
}
