package codingtest.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MainTime {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        process2(st);

        long endTime = System.currentTimeMillis();
        System.out.println("Time in milliSeconds: " + (endTime - startTime));
    }

    private static void process1(StringTokenizer st) {
        long sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }

    private static void process2(StringTokenizer st) {
        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        System.out.println(a + b + c);
    }
}
