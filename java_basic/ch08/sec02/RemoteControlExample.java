package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        new Television().turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
