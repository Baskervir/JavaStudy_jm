package Chapter4;

import java.util.Scanner;

/**
 * 양의 정수값을 읽어서 소수인지 판정하는 프로그램
 * **/
public class Prime {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n;
        do {
            System.out.print("Integer above 2: ");
            n = stdIn.nextInt();
        } while (n < 2);

        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }

        if (i == n) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}
