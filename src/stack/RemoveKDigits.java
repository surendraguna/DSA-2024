package stack;

import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        String str = "1432219";
        System.out.println(removeKdigits(str, 1));
    }

    private static String removeKdigits(String a, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < a.length(); i++){
            while (stack.size() > 0 && k > 0 && stack.peek() >= a.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(a.charAt(i));
        }
        while (k-- > 0 && !stack.isEmpty()) 
            stack.pop();
        StringBuffer str = new StringBuffer();
        for(Character c : stack){
            str.append(c);
        }
        return (str.length() == 0) ? "0" : str.toString();
    }
}
