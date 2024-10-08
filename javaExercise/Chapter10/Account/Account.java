package Chapter10.Account;

import Chapter10.Day.Day;

public class Account {
    private static int counter = 0;

    private String name;
    private String no;
    private long balance;
    private Day openDay;
    private int id;

    /**
     * 인스턴스 초기화 블록
     * 인스턴스 생성 시 마다 블록 내부 수행문 수행된다
     * **/
    {
        id = ++counter;
        System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
    }

    public Account (String name, String no) {
        this(name, no, 0, new Day());
    }

    public Account(String name, String no, long balance, Day openDay) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        this.openDay = openDay;
    }

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public long getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public Day getOpenDay() {
        return new Day(openDay);
    }

    void deposit(long k) {
        balance += k;
    }

    void withdraw(long k) {
        balance -= k;
    }

    public String toString() {
        return "{" + name + ", " + no + ", " + balance + "}";
    }
}
