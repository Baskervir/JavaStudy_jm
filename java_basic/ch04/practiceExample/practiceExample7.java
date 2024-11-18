package ch04.practiceExample;

import java.util.Scanner;

/**
 * while 문과 Scanner의 nextLine() 메서드를 이용
 * 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성하기
 * **/
public class practiceExample7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 0;
        boolean flag = true;
        String userInput = "";

        while (flag) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");

            System.out.print("선택> ");
            userInput = sc.nextLine();

            if (userInput.equals("1")) {
                System.out.print("예금액>");
                balance += sc.nextInt();
                //개행문자? sc.nextLine(); 누락시 1 or 2 입력시에 (18~20) 라인이 재출력되는 문제
                sc.nextLine();
            }

            if (userInput.equals("2")) {
                System.out.print("출금액>");
                balance -= sc.nextInt();
                //개행문자? sc.nextLine(); 누락시 1 or 2 입력시에 (18~20) 라인이 재출력되는 문제
                sc.nextLine();
            }

            if (userInput.equals("3")) {
                System.out.println("잔고>" + balance);
            }

            if (userInput.equals("4")) {
                flag = false;
                System.out.println();
                System.out.println("프로그램 종료");
            }
        }
    }
}
