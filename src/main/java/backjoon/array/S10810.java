package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10810 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketCount = Integer.parseInt(st.nextToken());
        int gameCount = Integer.parseInt(st.nextToken());

        int[] basket = new int[basketCount];
        for (int x = 0; x < gameCount; x++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int ballNumber = Integer.parseInt(st.nextToken());

            for (int index = from; index <= to; index++) {
                basket[index - 1] = ballNumber;
            }
        }

        for (int i = 0; i < basketCount; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}