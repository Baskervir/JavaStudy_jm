package Chapter6;

import java.util.Scanner;

// 6명의 두 과목(국어, 수학) 점수로부터 과목별/학생별 평균
public class PointTotalization {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        final int number = 6;
        int[][] point = new int[number][2];
        int[] sumStudent = new int[number];
        int[] sumSubject = new int[2];

        System.out.printf("%d명의 국어, 수학 점수를 입력하세요.\n", number);

        for (int i = 0; i < number; i++) {
            System.out.printf("%d번 국어 : ", i + 1);
            point[i][0] = stdIn.nextInt();
            System.out.print("   수학 : ");
            point[i][1] = stdIn.nextInt();

            sumStudent[i] = point[i][0] + point[i][1];
            sumSubject[0] += point[i][0];
            sumSubject[1] += point[i][1];
        }

        System.out.println("No.    국어     수학     평균");
        for (int i = 0; i < number; i++) {
            System.out.printf("%2d%8d%8d%9.1f\n", i + 1, point[i][0], point[i][1], (double) sumStudent[i] / 2);
        }

        System.out.printf("평균 %6.1f%8.1f\n", (double) sumSubject[0] / number, (double) sumSubject[1] / number);

    }
}
