package backjoon.math;

import java.io.*;

public class S2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCount; i++) {
            int money = Integer.parseInt(br.readLine());
            for (Coin coin : Coin.values()) {
                int unit = (int) (coin.getUnit() * 100);
                int count = money / unit;
                money %= unit;
                bw.write(count + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public enum Coin {
        QUARTER(0.25),
        DIME(0.10),
        NICKEL(0.05),
        PENNY(0.01),
        ;

        private final double unit;

        Coin(double unit) {
            this.unit = unit;
        }

        public double getUnit() {
            return unit;
        }
    }
}