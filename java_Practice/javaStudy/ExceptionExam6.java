package javaStudy;

public class ExceptionExam6 {
    public int get50thItem(int[] array) throws IllegalArgumentException {
        if (array.length < 50) {
            throw new IllegalArgumentException();
        }
        return array[49];
    }
}
