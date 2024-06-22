package basic;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfAllDivisiors {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                a.add(i);
                if(n / i != i) {
                    a.add(n / i);
                }
            }
        }
        Collections.sort(a);
        System.out.println(a);
        int sum = 0;
        for (Integer i : a) {
            sum += help(i);
        }
        System.out.println(sum);
    }

    static int help(int n){
        int sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                sum += i;
                if(n / i != i){
                    sum += n/i;
                }
            }
        }
        return sum;
    }
}
