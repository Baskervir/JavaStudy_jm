package javaStudy;

public class MyCalTest {
    public static void main(String[] args) {
        System.out.println("===default method test===");
        Calculator cal = new MyCal();
        System.out.println("plusMethod) 3 + 4 = " + cal.plus(3, 4));
        System.out.println("execMethod) 5 + 6 = " + cal.exec(5, 6));

        int i = cal.plus(5, 4);
        int j = cal.exec(7, 5);
        System.out.println("int i = cal.plus(5, 4)");
        System.out.println("i = " + i);
        System.out.println("int j = cal.exec(7, 5)");
        System.out.println("j = " + j);
        System.out.println();

        System.out.println("===static method test===");
        System.out.println("exec2) 3 x 4 = " + Calculator.exec2(3, 4));
    }
}
