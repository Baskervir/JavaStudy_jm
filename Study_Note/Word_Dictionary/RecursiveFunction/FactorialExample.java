public class FactorialExample {
    // 재귀적으로 팩토리얼을 계산하는 메소드
    public static int factorial(int n) {
        // 기본 사례: n이 0일 때 1을 반환합니다.
        if (n == 0) {
            return 1;
        } else {
            // 재귀 사례: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        // 팩토리얼을 계산하고 출력합니다.
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}