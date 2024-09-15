package Chapter6;

import java.util.Scanner;

// 점수를 입력 받아서 합계, 평균, 최고점, 최저점 표시
public class PointSumAve {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("사람 수 : ");
        int n = stdIn.nextInt();
        int[] points = new int[n];

        System.out.println("점수를 입력하세요.");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번의 점수 : ");
            points[i] = stdIn.nextInt();
            sum += points[i];
        }

        int max = points[0];
        int min = points[0];
        for (int i = 1; i < n; i++) {
            if (points[i] > max) max = points[i];
            if (points[i] < min) min = points[i];
        }
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + (double)sum / n);
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }
}