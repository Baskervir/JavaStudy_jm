package Chapter4;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Display Square");
        System.out.print("How about length?:");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" ■ ");
            }
            System.out.println("");
        }
    }
}
