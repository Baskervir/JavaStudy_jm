package javaStudy;

public class Taxi implements Meter {
    @Override
    public int stop(int distance) {
        return distance * 2;
    }

    @Override
    public void start() {}
}
