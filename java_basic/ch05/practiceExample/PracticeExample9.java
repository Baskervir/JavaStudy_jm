package ch05.practiceExample;

import java.util.Scanner;

/**
 * 키보드로 학생 수와 각 학생들의 점수를 입력
 * while 문과 Scanner의 nextLine() 메서드를 이용
 * 최고 점수 및 평균 점수를 출력하는 코드 작성하기
 * **/
public class PracticeExample9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[0];
        
        boolean flag = true;
        
        while (flag) {
            System.out.println("------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");
            int n = sc.nextInt();
            
            switch (n) {
                case 1:
                    System.out.print("학생수>");
                    n = sc.nextInt();
                    scores = new int[n];
                    break;
                case 2:
                    for (int i = 0; i <= n; i++) {
                        System.out.print("scores[" + i + "]>");
                        scores[i] = sc.nextInt();
                        sc.nextLine();
                    }
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }
                    break;
                case 4:
                    int maxScore = 0;
                    int scoresSum = 0;
                    for (int i = 0; i < scores.length; i++) {
                        scoresSum += scores[i];
                        if (maxScore < scores[i]) {
                            maxScore = scores[i];
                        }
                    }
                    System.out.println("최고 점수: " + maxScore);
                    System.out.println("평균 점수: " + (double) scoresSum / scores.length);
                    break;
                case 5:
                    flag = false;
                    System.out.println("프로그램 종료");
            }
        }
    }
}
