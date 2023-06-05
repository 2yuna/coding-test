package backjoon.array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketCount = Integer.parseInt(st.nextToken());
        int reverseCount = Integer.parseInt(st.nextToken());

        int[] basket = new int[basketCount];
        for (int i = 0; i < basketCount; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < reverseCount; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;

            reverseArray(basket, from, to);
        }
        br.close();

        for (int number : basket) {
            bw.write(number + " ");
        }

        bw.flush();
        bw.close();
    }

    public static void reverseArray(int[] array, int from, int to) {
        int[] copyArray = Arrays.copyOfRange(array, from, to + 1);
        for (int index = copyArray.length - 1; index >= 0; index--) {
            array[to - index] = copyArray[index];
        }
    }
}
