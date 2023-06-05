package codingtest.test;

public class Kakao {

    public static void main(String[] args) {
        solution(2, new String[]{"M~C<2", "C~M>1"});
//        "N~F=0", "R~T>2"
    }

    public static int solution(int n, String[] data) {
        if (n < 0 || n > 100 ) {
            throw new IllegalArgumentException("정수의 범위를 벗어났습니다. 1 <= n <= 100");
        }

        int answer = 0;
        String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
        
        int friendsCount = 8;
        int a = calculate(friendsCount);
        System.out.println(calculate(7) + calculate(4));
        System.out.println(calculate(3) + calculate(2));
//        7
//        5
        return answer;
    }

    public static int calculate(int n) {
        int multi1 = 1;
        for (int i = 0; i < n; i++) {
            multi1 *= (i + 1);
        }
        return multi1;
    }
}
