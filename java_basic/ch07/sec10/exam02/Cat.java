package ch07.sec10.exam02;

public class Cat extends Animal {
    @Override   //추상 메서드 재정의. 오버라이딩
    public void sound() {
        System.out.println("야옹");
    }
}
