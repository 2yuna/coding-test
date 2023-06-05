package codingtest.test;

import java.io.*;
import java.util.StringTokenizer;

public class MainBackup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = getInputStringToken(br);
        int basketCount = Integer.parseInt(st.nextToken());
        int exchangeCount = Integer.parseInt(st.nextToken());

        int[] basket = initBasket(basketCount);

        exchangeBasket(br, exchangeCount, basket);

        print(basket);
    }

    private static void print(int[] basket) {
        StringBuilder sb = new StringBuilder();
        for (int ball : basket) {
            sb.append(ball).append(" ");
        }
        System.out.println(sb);
    }

    private static void exchangeBasket(BufferedReader br, int exchangeCount, int[] basket) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < exchangeCount; i++) {
            st = getInputStringToken(br);
            int basketIndex = Integer.parseInt(st.nextToken()) - 1;
            int swapBasketIndex = Integer.parseInt(st.nextToken()) - 1;

            swap(basket, basketIndex, swapBasketIndex);
        }
    }

    private static int[] initBasket(int n) {
        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }
        return basket;
    }

    public static StringTokenizer getInputStringToken(BufferedReader br) throws IOException {
        return new StringTokenizer(br.readLine());
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}