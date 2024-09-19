package Chapter7;

import java.util.Scanner;

// 배열이 가지는 모든 요소의 합 구하기 (기본 for문)
public class SumOf1 {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    /**
     * 기본 for문 -> 확장 for문
     * static int sumOf(int[] a) {
     *     int sum = 0;
     *     for (int i : a) {
     *         sum += i;
     *     }
     *     return sum;
     * }
     * **/

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("모든 요소의 합은 " + sumOf(x) + "입니다.");
    }
}
