package searching;

import java.util.Arrays;
import java.util.Hashtable;

public class FindDuplicate {
    public static void main(String[] args) {
        int a[] = {3, 2, 1, 2, 2, 3, 1, 1, 4, 4, 4};
        int b[] = Arrays.copyOf(a, a.length);
        for(int i = 0; i < a.length; i++){
            int temp = Math.abs(a[i]);
            if(a[temp] < 0) {
                System.out.println("contains " + Math.abs(a[i]));
                break;
            }
            a[temp] = -a[temp];
        }
        Hashtable<Integer, Integer> map = new Hashtable<>();
        for(int i = 0; i < b.length; i++){
            if(map.containsKey(a[i])) {
                map.put(b[i], map.get(b[i]) + 1);
            }
            else 
                map.put(b[i], 1);
        }
        System.out.println(map);

    }
}
