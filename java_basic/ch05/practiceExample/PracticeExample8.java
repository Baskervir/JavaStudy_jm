package ch05.practiceExample;
/**
 * 배열 항목의 전체 합과 평균을 구하는 코드 작성하기
 * 중첩 for 문 이용
 * **/
public class PracticeExample8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < array.length; i++) {
            totalCount += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
            }
        }
        System.out.println("전체 합 = " + totalSum);
        double totalAvg = (double) totalSum / totalCount;
        System.out.println("전체 평균 = " + totalAvg);
    }
}
