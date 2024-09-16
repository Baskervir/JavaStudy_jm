package Chapter7;

import java.util.Scanner;

// 입력한 정수의 부호를 판정
class SignOf1 {
    static String signOf(int n) {
        String sign = "";

        if (n > 0) sign = "양수";
        else if (n < 0) sign = "음수";

        return sign;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 x : ");
        int x = stdIn.nextInt();

        String s = signOf(x);
        System.out.println("signOf(x)는 " + s + "입니다.");
    }
}
