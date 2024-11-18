package ch04.practiceExample;
/**
 * for 문을 이용
 * *
 * **
 * ***
 * ****
 * *****
 * 와 같은 결과가 나오도록 만들기
 * **/
public class practiceExample6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
