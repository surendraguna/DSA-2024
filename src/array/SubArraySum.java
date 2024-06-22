package array;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int a[] = {28,54,7,-70,22,65,-6};
        System.out.println(subarraySum(a, 100));
        System.out.println(subarraySumOptimize(a, 100));
    }
    public static int subarraySumOptimize(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int s = 0, res = 0;
        for(int i : a) {
            s += i;
            if(map.containsKey(s - k)) 
                res += map.get(s - k);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return res;
    }
    public static int subarraySum(int[] a, int k) {
        int res = 0;
        for(int i = 0; i < a.length; i++){
            int sum = 0;
            for(int j = i; j < a.length; j++){
                sum += a[j];
                if(sum == k){
                    res += 1;
                }
            }
        }
        return res;
    }
}
