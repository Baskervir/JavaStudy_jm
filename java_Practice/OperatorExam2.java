public class OperatorExam2 {
    public void calculate(int a, int b) {
        //a가 b보다 큰지 비교한 결과(true 또는 false)를 c에 저장
        boolean c = (a > b);
        //a와 b가 같은지 비교한 결과를 d에 저장
        boolean d = (a == b);
        //a와 b가 다른지 비교한 결과를 e에 저장
        boolean e = (a != b);

        System.out.println(a + "은(는) " + b + "보다 큽니까? " + c);
        System.out.println(a + "은(는) " + b + "와(과) 같습니까? " + d);
        System.out.println(a + "은(는) " + b + "와(과) 다릅니까? " + e);
    }

    public static void main(String[] args) {
        // 0~10 사이 값을 랜덤하게 변수 a와 b에 넣기
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        new OperatorExam2().calculate(a, b);
    }
}
