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

/**
 * 메서드 (method)
 * 프로그램의 '부품'
 * 메서드 사용 하기 위해 메서드 선언 필요
 *
 * 메서드 헤더 (method header)
 * 메서드의 이름과 사양을 기술
 * 반환형, 메서드명, 매개 변수 나열
 *
 * 메서드 본문 (method body)
 * {}로 감싼 0개 이상의 실행문 집합
 *
 * 프로그램 시작할 때 실행되는 main 메서드
 * 그 앞에 다른 메서드가 있더라도 main 우선
 * **/