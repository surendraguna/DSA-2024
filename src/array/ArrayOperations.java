package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {2, 4, 2, 4, 6, 5};
        ArrayList<Integer> a = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        boolean flag = true;
        while (flag) {
            int ch = s.nextInt();
            switch (ch) {
                case 1 -> {
                    a.add(s.nextInt());
                    System.out.println(a);
                }

                case 2 -> {
                   a.remove(Integer.valueOf(s.nextInt()));
                   System.out.println(a);
                }

                case 3 -> {
                    HashMap<Integer, Integer> map = new HashMap<>();
                    for (int i = 0; i < a.size(); i++) {
                        if(map.containsKey(a.get(i)))
                            map.put(a.get(i), map.get(a.get(i)) + 1);
                        else
                            map.put(a.get(i), 1);
                    } 
                    System.out.println(map);
                    System.out.println(map.get(s.nextInt()));
                }
                default -> flag = false;
            }
        }
        s.close();
    }
}
