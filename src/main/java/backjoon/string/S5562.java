package backjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class S5562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            Dial dial = Dial.of(word.charAt(i));
            sum += dial.calculateTime();
        }
        System.out.println(sum);
    }

    public enum Dial {
        ONE(1, null),
        TWO(2, "ABC"),
        THREE(3, "DEF"),
        FOUR(4, "GHI"),
        FIVE(5, "JKL"),
        SIX(6, "MNO"),
        SEVEN(7, "PQRS"),
        EIGHT(8, "TUV"),
        NINE(9, "WXYZ"),
        ZERO(0,  null),
        ;

        private final int number;
        private final String alphabet;

        Dial(int number, String alphabet) {
            this.number = number;
            this.alphabet = alphabet;
        }

        public static Dial of(char c) {
            return Arrays.stream(Dial.values())
                    .filter(dial -> Objects.nonNull(dial.alphabet))
                    .filter(dial -> dial.alphabet.contains(Character.toString(c)))
                    .findFirst()
                    .orElse(null);
        }

        public int calculateTime() {
            return this.number + 1;
        }
    }
}
