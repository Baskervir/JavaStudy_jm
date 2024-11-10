package javaStudy;

public class ExceptionExam6 {
    public int get50thItem(int[] array) throws IllegalArgumentException {
        if (array.length < 50) {
            throw new IllegalArgumentException();
        }
        return array[49];
    }
}

/**
 * 원하는 조건으로 예외를 발생시키려면 throw 키워드를 사용하여 예외 객체를 생성하면 된다.
 * 자바 언어가 자체적으로 제공하는 예외는 일반적인 예외다.
 * 사용자는 일반적인 경우가 아니더라도 예외를 발생시키고 싶다.
 * 예를 들면, 1~100 사이의 숫자만 입력하기.
 *          배열의 길이가 50보다 작으면 예뢰를 발생시키기.
 * 사용자가 원하는 경우에 강제로 예외를 발생시킬 수 있다.
 * **/