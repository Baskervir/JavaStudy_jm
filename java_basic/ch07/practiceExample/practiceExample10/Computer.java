package ch07.practiceExample.practiceExample10;

public class Computer extends Machine {
    @Override
    public void work() {
        System.out.println("work() 메서드를 재정의 해야 컴파일 오류가 발생하지 않습니다.");
    }
}
