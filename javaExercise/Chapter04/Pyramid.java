package Chapter04;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Display Pyramid");
        System.out.print("How many floor?:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("▲");
            }
            System.out.println();
        }
    }
}
