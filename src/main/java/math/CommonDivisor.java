package math;

public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(192, 162));
        System.out.println(lcm(1112, 695));
    }

    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return gcd(num2, num1 % num2);
    }

    public static int lcm(int num1, int num2) {
        return num1 * num2 / gcd(num1, num2);
    }
}
