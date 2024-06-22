package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumRope {
    public static void main(String[] args) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
        int a[] = {4, 3, 2, 6};
        for (int i : a) {
            que.offer(i);
        }
        int ans = 0;
        while (que.size() > 1) {
            int x = que.poll(); int y = que.poll();
            que.offer(x + y);
            ans += x + y;
        }     
        System.out.println(ans);
    }
}
