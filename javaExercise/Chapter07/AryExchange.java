package Chapter07;

import java.util.Scanner;

// 두 배열의 전체 요소값을 교환
public class AryExchange {
    static void aryExchange(int[] a, int[] b) {
        int n = a.length < b.length ? a.length : b.length;
        for (int i = 0; i < n; i++) {
            int t = a[i];
            a[i] = b[i];
            b[i] = t;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열 a의 요소 수 : ");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("배열 b의 요소 수 : ");
        int numb = stdIn.nextInt();
        int[] b = new int[numb];
        for (int i = 0; i < numb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = stdIn.nextInt();
        }

        aryExchange(a, b);
        System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println("-----------------------------");
        for (int i = 0; i < numb; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}
