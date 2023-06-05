package backjoon.multiarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 100, m = 100;
        int[][] paperArray = new int[n][m];

        int count = 0;
        int confettiCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < confettiCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int bottom = Integer.parseInt(st.nextToken());

            for (int j = left; j < left + 10; j++) {
                for (int k = bottom; k < bottom + 10; k++) {
                    int multiArray = paperArray[j][k];
                    if (multiArray == 0) {
                        count++;
                    }

                    paperArray[j][k] = 1;
                }
            }
        }

        System.out.println(count);
    }
}
