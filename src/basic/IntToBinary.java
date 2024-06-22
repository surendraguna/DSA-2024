package basic;

import java.util.Arrays;

public class IntToBinary {

    public String toString(){
        System.out.println("hello world");
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(Integer.valueOf("1234".toString())));
        int a[] = new int[5];
        Arrays.fill(a, 10);
        Integer[] b = Arrays.stream(a).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(b));
        a = Arrays.stream(b).mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(a));
        IntToBinary c = new IntToBinary();
        System.out.println(new IntToBinary() + " " + c);
    }
}
