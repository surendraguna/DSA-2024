package array;

import java.util.HashMap;

public class PairWithGivenXor {
    public static void main(String[] args) {
        int a[] = {3, 6, 8, 10, 15, 50};
        int b = 5;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++){
            int r = a[i] ^ b;
            ans += map.getOrDefault(r, 0);
            int cF = map.getOrDefault(a[i], 0);
            map.put(a[i], cF + 1);
        }
        System.out.println(ans);
    }
}
