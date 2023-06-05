import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        double dotCount = Math.pow(2, number) + 1;
        System.out.println((int) Math.pow(dotCount, 2));
    }
}