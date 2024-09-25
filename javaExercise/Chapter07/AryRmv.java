package Chapter07;
// 배열의 요소 삭제

import java.util.Scanner;

/**
 * 배열 a로부터 a[idx]를 삭제하는 aryRmv메서드 작성
 * void aryRmv(int[] a, int idx)
 * a[idx]의 삭제 -> 뒤에 있는 요소들을 앞으로 하나씩 이동
 * 이동 후 비게되는 마지막 요소 a[a.length - 1]의 값은 이동하기 전의 마지막 값을 유지할 것
 * ex) a = {1, 3, 4, 7, 9, 11} -> aryRmv(a, 2) -> a = {1, 3, 7, 9, 11, 11}
 **/
public class AryRmv {
    // 배열 a에서 a[idx]를 삭제 -> 뒤에 있는 요소들으 하나씩 앞으로 이동)
    static void aryRmv(int[] a, int idx) {
        if (idx >= 0 && idx < a.length) {
            for (int i = idx; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("삭제할 요소의 index : ");
        int idx = stdIn.nextInt();

        aryRmv(a, idx);
        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
