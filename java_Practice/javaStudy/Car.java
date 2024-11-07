package javaStudy;

public class Car {
    static int wheelCount;
    int speed;

    public void print() {
        System.out.println("성공^^");
    }

    public void run() {
        System.out.println("차가 달립니다.");
    }
}

/**
 * static 키워드가 붙은 요소들은 메모리에 미리 올라와 있다.
 * static 키워드가 붙은 필드는 객체를 생성하기 전에 메모리 공간을 확보
 * 객체를 생성할 때마다 각각 메모리 공간을 확보하는 다른 필드와 다르게 값을 저장
 * 메모리 공간을 하나만 가진다 -> 모두 공유 (같은 값)
 * **/