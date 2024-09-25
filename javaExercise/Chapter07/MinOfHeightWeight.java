package Chapter07;

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

/**
 * minOf 메서드는 'int형 배열(의 참조)을 받아서 int형의 값을 반환하는 구조'
 * 
 * -minOf(height)
 * =신장용 배열 height의 참조를 minOf 메서드에 전달
 * =minOf 내의 배열 변수 a는 height을 참조한다
 * 
 * -minOf(weight)
 * =체중용 배열 weight의 참조를 minOf 메서드에 전달
 * =minOf 냐의 배열 변수 a는 weight을 참조한다
 * 
 * 매개 변수의 형은 int[]이다
 * 배열 요소의 형이 int형이면 받는 배열의 요소 수에는 제약이 없다
 * **/