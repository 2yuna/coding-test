package backjoon.multiarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] array1 = createIntArrayWithSplitReadLine(br, " ", n, m);
        int[][] array2 = createIntArrayWithSplitReadLine(br, " ", n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array1[i][j] + array2[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[] convertStringArrayToIntArray(String[] strArray) {
        return Arrays.stream(strArray)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int[][] createIntArrayWithSplitReadLine(BufferedReader br, String splitRegex, int n, int m) throws IOException {
        int[][] multiArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            multiArray[i] = convertStringArrayToIntArray(br.readLine().split(splitRegex));
        }
        return multiArray;
    }
}