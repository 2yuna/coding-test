package backjoon.deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        String reversedWord = sb.toString();

        System.out.println(word.equals(reversedWord) ? 1 : 0);
    }
}
