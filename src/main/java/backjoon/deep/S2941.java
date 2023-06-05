package backjoon.deep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        System.out.println(Croatian.test(word));
    }

    public enum Croatian {
        CR1("č", "c="),
        CR2("ć", "c-"),
        CR3("dž", "dz="),
        CR4("đ", "d-"),
        CR5("lj", "lj"),
        CR6("nj", "nj"),
        CR7("š", "s="),
        CR8("ž", "z="),
        ;

        private final String croatiaAlphabet;
        private final String modifiedCroatiaAlphabet;

        Croatian(String croatiaAlphabet, String modifiedCroatiaAlphabet) {
            this.croatiaAlphabet = croatiaAlphabet;
            this.modifiedCroatiaAlphabet = modifiedCroatiaAlphabet;
        }

        public static int test(String value) {
            String copyValue = value;
            int count = 0;
            boolean end = false;
            for (Croatian croatian : values()) {
                if (value.contains(croatian.modifiedCroatiaAlphabet)) {
                    copyValue = copyValue.replace(croatian.modifiedCroatiaAlphabet, "");
                    count++;
                }
            }

            return count + copyValue.length();
        }
    }
}
