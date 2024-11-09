package javaStudy;

public class MeterExam {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        System.out.println("기본요금 변경 전!!");
        taxi.stop(20);
        taxi.BASE_FARE = 2500;
        System.out.println("기본요금 변경 후!!");
        taxi.stop(20);
    }
}
