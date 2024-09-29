package Chapter06;
/**
 * 5며으이 사용자가 프린터를 이용하는 상황을 가정
 * **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void print() {
        Printer printer = Printer.getPrinter();
        printer.print(this.name + " print using " + printer.toString() + ".");
    }
}

public class Printer {
    private static Printer printer = null;
    private Printer() {}

    public static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }

    public void print(String str) {
        System.out.println(str);
    }
}

public class Main {
    private static final int User_NUM = 5;
    public static void main(String[] args) {
        User[] user = new User[User_NUM];
        for (int i = 0; i < User_NUM; i++) {
            user[i] = new User((i + 1) + "-user");
            user[i].print();
        }
    }
}