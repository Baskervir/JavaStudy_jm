package Chapter05;
// 세 정수의 평균값 구하기 (캐스트 연산자 이용)
import java.util.Scanner;

public class Average3WithCastOperator {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수값 x, y, z의 평균을 구합니다.");
        System.out.print("x : " ); int x = stdIn.nextInt();
        System.out.print("y : " ); int y = stdIn.nextInt();
        System.out.print("z : " ); int z = stdIn.nextInt();

        double ave = (double) (x + y + z) / 3;
        System.out.printf("x, y, z의 평균은 %.3f입니다.\n", ave);
    }
}

/**
 * 캐스트 연산자 (Cast Operator)
 * - (자료형) 표현식
 *
 * ===기본형의 확대 변환===
 * •byte -> short, int, long, float, double
 * •short -> int, long, float, double
 * •char -> long, float, double
 * •int -> long, float, double
 * •long -> float, double
 * •float -> double
 *  = 대입 or 초기화 시에 자동으로 이루어진다. 캐스트 필요 X
 * **/