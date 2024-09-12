package Chapter4;

import java.util.Scanner;

/**
 * n단의 숫자 피라미드를 표시합니다
 * i번째 행에는 i%10을 표시합니다
 * **/
public class DigitPyamid {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Display Digit_Pyramid");
        System.out.print("How many floors?:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }
}
