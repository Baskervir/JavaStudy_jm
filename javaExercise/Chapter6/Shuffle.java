package Chapter6;

import java.util.Random;
import java.util.Scanner;

// 배열의 나열 순서를 섞기
public class Shuffle {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for (int i = 0; i < 2 * n; i++) {
            int idx1 = rand.nextInt(n);
            int idx2 = rand.nextInt(n);
            int tmp = a[idx1];
            a[idx1] = a[idx2];
            a[idx2] = tmp;
        }

        System.out.println("Shuffle!");
        for (int i = 0; i < n; i++) System.out.println("a[" + i + "] = " + a[i]);
    }
}
