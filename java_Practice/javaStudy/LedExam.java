package javaStudy;

public class LedExam {
    public static void main(String[] args) {
        Tv tv = new LedTv();
        tv.turnOn();
        tv.changeVolume(8);
        tv.changeChannel(39);
        tv.turnOff();
    }
}
