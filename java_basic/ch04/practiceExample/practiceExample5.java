package ch04.practiceExample;
/**
 * 중첩 for 문을 이용
 * 방정식 4x + 5y = 60의 모든 해를 구하기
 * (x, y) 형태로 출력
 * 단, x와 y는 10 이하의 자연수
 * **/
public class practiceExample5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (4*i + 5*j == 60) {
                    System.out.printf("(%d, %d)\n", i, j);
                }
            }
        }
    }
}
