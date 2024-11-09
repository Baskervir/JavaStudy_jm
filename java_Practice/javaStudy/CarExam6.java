package javaStudy;

public class CarExam6 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        if (car instanceof Machine) {
            System.out.println("Car2가 Machine을 상속받았습니다.");
        } else {
            System.out.println("Car2가 Machine을 상속받지 않았습니다.");
        }
    }
}
