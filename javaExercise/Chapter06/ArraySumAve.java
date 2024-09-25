package Chapter06;

import java.util.Scanner;

// 모든 요소의 합과 평균을 구해서 표시 (확장 for문)
public class ArraySumAve {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소 수 : ");

        int n = stdIn.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextDouble();
        }

        double sum = 0;
        for (double i : a) {
            sum += i;
        }

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + sum/n);
    }
}
