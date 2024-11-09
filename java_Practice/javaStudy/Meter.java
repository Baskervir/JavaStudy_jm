package javaStudy;

public interface Meter {
    //public int BASE_FARE = 3000;
    public abstract void start();
    public abstract int stop(int distance);
}
/**
 * 인터페이스에 정의한 변수는 상수
 * **/