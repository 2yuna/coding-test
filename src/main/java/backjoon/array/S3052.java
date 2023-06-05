package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class S3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loopCount = 10;
        int divisor = 42;
        Set<Integer> remainders = new HashSet<>();

        for (int i = 0; i < loopCount; i++) {
            int dividend = Integer.parseInt(br.readLine());
            remainders.add(dividend % divisor);
        }

        System.out.println(remainders.size());

        br.close();
    }
}
