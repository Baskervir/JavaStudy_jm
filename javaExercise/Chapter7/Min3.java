package Chapter7;

import java.util.Scanner;

// 3개의 정수값에서 최소값 구하기
public class Min3 {
    static int min(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("Input Integer a : "); int a = stdIn.nextInt();
        System.out.print("Input Integer b : "); int b = stdIn.nextInt();
        System.out.print("Input Integer c : "); int c = stdIn.nextInt();
        System.out.println("Min value is " + min(a, b, c));
    }
}
