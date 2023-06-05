package backjoon.deep;

import java.io.*;
import java.util.StringTokenizer;

public class S4344 {
    public static void main(String[] args) throws IOException {Runtime.getRuntime().gc();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentCount = Integer.parseInt(st.nextToken());

            float sum = 0;
            int[] scores = new int[studentCount];
            for (int j = 0; j < studentCount; j++) {
                int score = Integer.parseInt(st.nextToken());
                scores[j] = score;
                sum += score;
            }

            float avg = sum / studentCount;
            int gtAvgCount = 0;
            for (int j = 0; j < studentCount; j++) {
                if (scores[j] > avg) {
                    gtAvgCount++;
                }
            }

            float result = (float) gtAvgCount / studentCount * 100;
            bw.write(String.format("%.3f%%", result));
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
