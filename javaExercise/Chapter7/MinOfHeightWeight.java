package Chapter7;

import java.util.Scanner;

// 가장 키가 작은 사람의 신장과 가장 마른 사람의 체중을 구한다
public class MinOfHeightWeight {
    static int minOf(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("사람 수 : ");
        int peopleNum = stdIn.nextInt();

        int[] height = new int[peopleNum];
        int[] weight = new int[peopleNum];

        System.out.println(peopleNum + "명의 신장과 체중을 입력하세요.");
        for (int i = 0; i < peopleNum; i++) {
            System.out.print((i + 1) + "번의 신장 : ");
            height[i] = stdIn.nextInt();
            System.out.print((i + 1) + "번의 체중 : ");
            weight[i] = stdIn.nextInt();
        }

        System.out.println("가장 키가 작은 사람의 신장 : " + minOf(height) + "cm");
        System.out.println("가장 가벼운 사람의 체중 : " + minOf(weight) + "kg");
    }
}
