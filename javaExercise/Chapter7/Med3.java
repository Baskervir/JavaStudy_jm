package Chapter7;

import java.util.Scanner;

// 3개의 정수값에서 중간값 구하기
public class Med3 {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Input Integer a : "); int a = stdIn.nextInt();
        System.out.print("Input Integer b : "); int b = stdIn.nextInt();
        System.out.print("Input Integer c : "); int c = stdIn.nextInt();

        System.out.println("Med value is " + med3(a, b, c));
    }
}
