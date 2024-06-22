package basic;

public class xor {
    public static void main(String[] args) {
        System.out.println(callFun(true, true));
        System.out.println(callFun(false, false));
        System.out.println(callFun(false, true));
        System.out.println(callFun(true, false));
    }

    private static boolean callFun(boolean b, boolean c) {
        return b ^ c;
    }
}
