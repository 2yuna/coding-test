package programmers.dfsbfs;

public class TargetNumber {

    private static int answer = 0;

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        System.out.println("=======================");
        return answer;
    }

    private void dfs(int[] numbers, int target, int idx, int sum) {
        if (idx == numbers.length) {
            if (sum == target) {
                answer++;
                System.out.println(answer);
            }
        } else {
            dfs(numbers, target, idx + 1, sum + numbers[idx]);
            dfs(numbers, target, idx + 1, sum - numbers[idx]);
        }
    }
}
