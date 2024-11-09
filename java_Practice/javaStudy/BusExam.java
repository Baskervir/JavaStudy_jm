package javaStudy;

public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus("뛰뛰", 3000, 1050);
        if (bus.name != "뛰뛰") {
            System.out.println("bus의 name이 다릅니다.");
        } else if (bus.number != 3000) {
            System.out.println("bus의 number가 다릅니다.");
        } else if (bus.fee != 1050) {
            System.out.println("bus의 fee가 다릅니다.");
        } else {
            System.out.println("정답입니다.");
        }
        
        bus.run();
    }
}
/**
 * 상속받으면 상위 클래스가 가진 메서드를 사용할 수 있다.
 * 그러나 자식 클래스의 메서드가 필요하지만, 부모 클래스가 가진 메서드와 다르게 동작하고 싶다.
 * 별개의 메서드를 따로 정의할 수 도 있지만, 비슷하게 묶어놓은 목적에 각기 다른 메서드를 사용해야 하므로 불편하다
 * 이런 불편함을 줄이기 위해 자바는 오버라이딩이라는 개념을 이용한다.
 * 이때 자식 클래스는 상속받은 부모 클래스의 메서드 둘다 가지게 되는데, 오버라이딩되면 무조건 자식의 메서드를 사용한다.
 * **/