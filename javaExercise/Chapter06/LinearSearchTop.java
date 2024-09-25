package Chapter06;

import java.util.Scanner;

// 선형 탐색 (방법 1 : 가장 앞에 있는 요소를 탐색)
public class LinearSearchTop {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("찾을 숫자 : ");
        int key = stdIn.nextInt();

        int j;
        for (j = 0; j < n; j++) {
            if (a[j] == key) break;
        }

        if (j < n) System.out.println("The value in a[" + j + "]");
        else System.out.println("Has no value");
    }
}
