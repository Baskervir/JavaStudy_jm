package ch05.practiceExample;
/**
 * 배열 항목에서 최대값을 출력하는 코드 작성
 * for 문 이용
 * **/
public class PracticeExample7 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int maxNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        System.out.println(maxNum);
    }
}
