package javaStudy;

public class GasStation {
    public static void main(String[] args) {
        GasStation gs = new GasStation();
        Suv suv = new Suv("suv");
        Truck truck = new Truck("truck");
        Bus bus = new Bus("bus");

        gs.fill(suv);
        gs.fill(truck);
        gs.fill(bus);
    }

    public void fill(Car car) {
        System.out.println(car.name + "에 기름을 넣습니다.");
        car.gas += 10;
        System.out.println("기름이 " + car.gas + "리터 들어있습니다.");
    }
}
