package Chapter04;

import java.util.Scanner;

public class SeasonRepeat {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("계절을 찾습니다.");
        do {
            int month;
            do {
                System.out.print("몇 월입니까?:");
                month = stdIn.nextInt();
            } while (month < 1 || month > 12);

            if (month >= 3 && month <= 5) System.out.println("봄");
            else if (month >= 6 && month <= 8) System.out.println("여름");
            else if (month >= 9 && month <= 11) System.out.println("가을");
            else if (month == 12 || month == 1 || month == 2) System.out.println("겨울");

            System.out.print("Do you want Retry? 1...Yes / 0...No:");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
