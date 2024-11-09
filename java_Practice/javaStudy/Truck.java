package javaStudy;

public class Truck extends Car {
    public Truck() {
        super("Truck");
        System.out.println("Truck의 기본 생성자입니다.");
    }

    public Truck(String name) {
        super.name = name;
    }
}
