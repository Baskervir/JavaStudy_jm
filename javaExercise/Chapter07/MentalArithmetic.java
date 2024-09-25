/*
===문제 7 - 10===
package Chapter7;

import java.util.Random;
import java.util.Scanner;

// 암산 훈련 (3개의 3자리 정수를 사용한 계산)
public class MentalArithmetic {
    static Scanner stdIn = new Scanner(System.in);

    static boolean confirmRetry() {
        int cnt;
        do {
            System.out.print("다시 한 번? <Yes...1/ No...0> : ");
            cnt = stdIn.nextInt();
        } while (cnt != 0 && cnt != 1);
        return cnt == 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("암산 훈련!");

        do {
            int x = rand.nextInt(900) + 100;
            int y = rand.nextInt(900) + 100;
            int z = rand.nextInt(900) + 100;
            int pattern = rand.nextInt(4);

            int answer;
            switch (pattern) {
                case 0: answer = x + y + z; break;
                case 1: answer = x + y - z; break;
                case 2: answer = x - y + z; break;
                default: answer = x - y - z; break;
            }
        } while (true);{
            System.out.print(x + ((pattern < 2) ? " + " : " - ") + y + ((pattern % 2 == 0) ? " + " : " - ") + z + " = ");
        }
    }
}
*/
