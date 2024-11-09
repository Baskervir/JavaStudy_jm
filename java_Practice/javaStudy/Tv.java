package javaStudy;

public interface Tv {
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
/**
 * 참조 변수의 타입으로 인터페이스를 사용 가능
 * 인터페이스가 가진 메서드만 사용 가능
 * **/