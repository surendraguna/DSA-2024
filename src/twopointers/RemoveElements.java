package twopointers;

import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(4);
        array.add(1);
        array.add(2);
        array.add(1);
        array.add(1);
        System.out.println( slove(array, 1));
    }

    private static ArrayList<Integer> slove(ArrayList<Integer> a, int b) {
        int c = 0;
        for(int i = 0; i < a.size(); i++)
            if(a.get(i) != b)
                a.set(c++, a.get(i));
        for(int i = a.size() - 1; i >= c; i--)  
            a.remove(i);
        return a;
    }
}
