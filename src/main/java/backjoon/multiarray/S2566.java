package backjoon.multiarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MaxInfo maxInfo = new MaxInfo();

        int n = 9;
        int m = 9;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                maxInfo.max(Integer.parseInt(st.nextToken()), i, j);
            }
        }
        maxInfo.print();
    }

    static class MaxInfo {
        private int max;
        private int row;
        private int column;

        public void max(int value, int row, int column) {
            if (value > this.max) {
                this.max = value;
                this.row = row;
                this.column = column;
            }
        }

        public void print() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.max).append("\n");
            sb.append(this.row + 1).append(" ");
            sb.append(this.column + 1);

            System.out.println(sb);
        }
    }
}