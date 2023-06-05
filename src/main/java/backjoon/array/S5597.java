package backjoon.array;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class S5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalStudentCount = 30;
        int submittedCount = 28;

        Map<Integer, Boolean> assignmentStudentMap = new HashMap<>();
        for (int i = 0; i < totalStudentCount; i++) {
            assignmentStudentMap.put(i + 1, false);
        }

        for (int i = 0; i < submittedCount; i++) {
            int studentNumber = Integer.parseInt(br.readLine());
            assignmentStudentMap.put(studentNumber, true);
        }

        for (Map.Entry<Integer, Boolean> entry : assignmentStudentMap.entrySet()) {
            if (!entry.getValue()) {
                bw.write(entry.getKey() + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
