package hashing;

import java.util.HashSet;

public class PairDifference {
    public static void main(String[] args) {
        int a[] = {478, 358, -38, -536, 705};
        int b = 320;
        System.out.println(solve(a, b));
    }

    private static int solve(int[] a, int b) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i = 0; i < a.length; i++)
            if(set.contains(b - a[i]) || set.contains(b + a[i]))
                return 1;
        return 0;
    }
}
