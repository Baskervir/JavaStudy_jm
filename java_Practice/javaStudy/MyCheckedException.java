package javaStudy;

public class MyCheckedException extends Exception {
    public MyCheckedException() {
        super("나의 예외 발생");
    }
}

/**
 * RuntimeException class를 상속받으면 UnCheckedException
 * Exception class를 상속받으면 Checked Exception
 * 문제에서는 Exception 발생하면 "나의 예외 발생"이라는 메시지를 출력하고 싶었다.
 * 기본 생성자의 super메서드를 호출할 때 인자로 해당 메시지를 넣어주면 된다.
 * **/
