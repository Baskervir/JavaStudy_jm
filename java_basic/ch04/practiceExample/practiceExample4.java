package ch04.practiceExample;
/**
 * 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력
 * 눈의 합이 5가 아니면 계속 주사위를 던진다
 * 눈의 합이 5 이면 실행을 멈춘다
 * **/
public class practiceExample4 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        boolean flag = true;

        while (flag) {
            dice1 = (int)(Math.random()*6) + 1;
            dice2 = (int)(Math.random()*6) + 1;

            if (dice1 + dice2 == 5) {
                flag = false;
            }
            System.out.println("(" + dice1 + ", " + dice2 + ")");
        }
    }
}
