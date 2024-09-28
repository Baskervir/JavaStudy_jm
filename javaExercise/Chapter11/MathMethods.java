package Chapter11;
// 실수값을 읽어서 절대값, 제곱근, 원의 넓이 구하기
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.out;

class MathMethods {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        out.print("실 수 : ");
        double x = stdIn.nextDouble();

        out.println("절대값 : " + abs(x));
        out.println("제곱근 : " + sqrt(x));
        out.println("넓 이 " + PI*x*x);
    }
}
