package javaStudy;

public class ExceptionExam2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        try {
            array[20] = 5;
        } catch (Exception e) {
            System.out.println("배열의 범위를 지나쳤어요." + e.toString());
        } finally {}
        System.out.println("성공");
    }
}