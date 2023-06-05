package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketCount = Integer.parseInt(st.nextToken());
        int exchangeCount = Integer.parseInt(st.nextToken());

        int[] basket = new int[basketCount];
        for (int i = 0; i < basketCount; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < exchangeCount; i++) {
            st = new StringTokenizer(br.readLine());
            int basketIndex = Integer.parseInt(st.nextToken()) - 1;
            int swapBasketIndex = Integer.parseInt(st.nextToken()) - 1;

            swap(basket, basketIndex, swapBasketIndex);
        }

        StringBuilder sb = new StringBuilder();
        for (int ball : basket) {
            sb.append(ball).append(" ");
        }
        System.out.println(sb);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}