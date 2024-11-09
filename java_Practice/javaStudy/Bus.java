package javaStudy;

public class Bus extends Car {
    int fee;

    public Bus(String name) {
        super.name = name;
    }

    public Bus(String name, int number, int fee) {
        super(name, number);
        this.fee = fee;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("차가 달리면서 다음 정거장을 안내합니다.");
    }
}
