package string;

import java.util.ArrayList;

public class IntInStr {
    public static void main(String[] args) {
        String a = "811325037";
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        int n = 0;
        while(i < a.length() - 1){
            char ch = a.charAt(i);
            if(Character.isDigit(ch) && a.charAt(i + 1) == ',') { 
                n = n * 10 + (ch - '0');
                arr.add(n);
                n = 0;
            } else if (Character.isDigit(ch)){
                n = n * 10 + (ch - '0');
            }
            i++;
        }
        if(Character.isDigit(a.charAt(i)))
            arr.add(n * 10 + (a.charAt(i) - '0'));
        System.out.println(arr);
    }
    
}
