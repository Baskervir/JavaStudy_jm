package ch06.practiceExample.bank;

import java.util.Scanner;

public class BankApplication {
    private Account[] accounts;
    private int accountCount;

    public BankApplication() {
        accounts = new Account[100];
        accountCount = 0;
    }

    public void createAccount(Scanner scanner) {
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");

        System.out.print("계좌번호 : ");
        String accountNo = scanner.nextLine();

        System.out.print("계좌주 : ");
        String accountOwner = scanner.nextLine();

        System.out.print("초기입금액 : ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account account = new Account(accountNo, accountOwner, balance);
        accounts[accountCount++] = account;

        System.out.println("결과 : 계좌가 생성되었습니다.");
    }

    public void displayAccountList() {
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");

        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayAccountInfo();
        }
    }

    public void deposit(Scanner scanner) {
        System.out.println("----");
        System.out.println("예금");
        System.out.println("----");

        System.out.print("계좌번호 : ");
        String accountNo = scanner.nextLine();

        Account account = findAccount(accountNo);
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("예금액 : ");
        int amount = Integer.parseInt(scanner.nextLine());

        account.deposit(amount);
        System.out.println("결과 : 예금이 성공되었습니다.");
    }

    public void withdraw(Scanner scanner) {
        System.out.println("----");
        System.out.println("출금");
        System.out.println("----");

        System.out.println("계좌번호 : ");
        String accountNo = scanner.nextLine();

        Account account = findAccount(accountNo);
        if (account == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("출금액 : ");
        int amount = Integer.parseInt(scanner.nextLine());

        if (account.withdraw(amount)) {
            System.out.println("결과 : 출금이 성공되었습니다.");
        } else {
            System.out.println("출금 실패");
        }
    }

    private Account findAccount(String accountNo) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNo().equals(accountNo)) {
                return accounts[i];
            }
        }

        return null;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 > ");
            int selectedNum = Integer.parseInt(scanner.nextLine());

            if (selectedNum == 1) {
                createAccount(scanner);
            } else if (selectedNum == 2) {
                displayAccountList();
            } else if (selectedNum == 3) {
                deposit(scanner);
            } else if (selectedNum == 4) {
                withdraw(scanner);
            } else if (selectedNum == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }

        scanner.close();
    }
}
