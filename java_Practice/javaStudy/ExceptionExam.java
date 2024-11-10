package javaStudy;

public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        try {
            int k = i / j;
            System.out.println(k);
        } catch (Exception e) {
            System.out.println("예외 발생" + e.toString());
        } finally {
            System.out.println("예외와 상관없이 무조건 실행!");
        }
        System.out.println("main end!!");
    }
}
