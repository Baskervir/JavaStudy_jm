package ch06.practiceExample.account;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0 || balance > 1000000) {
            System.out.println("balance 값이 잘못되었습니다.");
        } else {
            this.balance = balance;
        }
    }
}
