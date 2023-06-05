package backjoon.deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S10812 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int basketCount = Integer.parseInt(st.nextToken());
        int[] baskets = new int[basketCount];
        for (int i = 0; i < basketCount; i++) {
            baskets[i] = i;
        }

        int rotationCount = Integer.parseInt(st.nextToken());
        for (int i = 0; i < rotationCount; i++) {
            st = new StringTokenizer(br.readLine());
            int begin = Integer.parseInt(st.nextToken()) - 1;
            int mid = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            System.out.println("rotation : " + begin + " " + mid + " " + end + " ");

            // 1 4 6
            // 3 8 9
            // begin, begin+1, ..., mid-1, mid, mid+1, ..., end-1, end
            // mid, mid+1, ..., end-1, end, begin, begin+1, ..., mid-1
            // 1, 2, 3, 4, 5, 5, 6
            // 3, 4, 5, 7, 8, 9, 8, 9
            // 2, 3, 4, 5, 6, 9, 10
            // 2, 3, 1, 2, 3, 5, 6

            int[] copy = Arrays.copyOf(baskets, basketCount);
            int index = 0;
            for (int j = 0; j < 2; j++) {
                baskets[index] = copy[begin + i];
                index++;
            }

            for (int j = 0; j < 3; j++) {
                baskets[index] = copy[mid - i];
                index++;
            }

            for (int j = 0; j < 2; j++) {
                baskets[index] = copy[end - i];
                index++;
            }
        }

        for (int basket : baskets) {
            System.out.print(basket + " ");
        }
    }
}
