public class ForExam {
    public static void main(String[] args) {
        // for 문을 이용 -> 1부터 100까지 숫자 중 짝수만 출력
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
