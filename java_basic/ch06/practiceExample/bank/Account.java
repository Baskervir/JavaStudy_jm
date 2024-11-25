package ch06.practiceExample.bank;

public class Account {
    private String accountNo;
    private String accountOwner;
    private int balance;

    public Account(String accountNo, String accountOwner, int balance) {
        this.accountNo = accountNo;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > this.balance) {
            System.out.println("잔액이 부족합니다.");
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public void displayAccountInfo() {
        System.out.println(accountNo + "\t" + accountOwner + "\t" + balance);
    }
}
