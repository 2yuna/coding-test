package backjoon.multiarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class S10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 5;
        List<String[]> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split("");
            strings.add(split);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (String[] string : strings) {
                try {
                    sb.append(string[i]);
                } catch (Exception ignored) {
                }
            }
        }

        System.out.println(sb);
    }
}
