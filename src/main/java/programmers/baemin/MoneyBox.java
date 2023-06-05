package programmers.baemin;

import java.util.Collections;
import java.util.PriorityQueue;

public class MoneyBox {
    public static int solution(int[] boxes, int m, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int box : boxes) {
            queue.offer(box);
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int moneyPerMillion = m / 10000 * queue.poll();
            if (moneyPerMillion <= 100000) {
                m += moneyPerMillion;
                count++;
            }

            if (count == k) {
                break;
            }
        }

        return m;
    }
}
