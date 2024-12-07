package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        // 선택번호
        int[] selectNumber = new int[6];
        Random random = new Random(15);  // 선택번호를 얻기 위한 Random 객체 생성
        System.out.print("선택번호: ");
        for(int i = 0; i<6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨번호
        int[] winnningNumber = new int[6];
        random = new Random(1149);
        System.out.print("당첨번호: ");
        for (int i=0; i<6; i++) {
            winnningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winnningNumber[i] + " ");
        }
        System.out.println();

        Arrays.sort(selectNumber);
        Arrays.sort(winnningNumber);
        boolean result = Arrays.equals(selectNumber, winnningNumber);
        System.out.print("당첨여부: ");
        if(result) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨되지 않았습니다.");
        }
    }
}
