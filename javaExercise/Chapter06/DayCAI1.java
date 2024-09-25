package Chapter06;

import java.util.Random;
import java.util.Scanner;

// 요일 영어 단어 학습 프로그램
public class DayCAI1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] dayKorean = {"일", "월", "화", "수", "목", "금", "토"};
        String[] dayEnglish = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("요일명을 첫 글자는 대문자, 나머지는 소문자로 입력하세요.(영어)");

        int retry;
        int last = -1;

        do {
            int day;
            do {
                day = rand.nextInt(7);
            } while (day == last);
            last = day;

            while (true) {
                System.out.print(dayKorean[day] + "요일 : ");
                String s = stdIn.next();

                if (s.equals(dayEnglish[day])) break;
                System.out.println("틀렸습니다.");
            }

            System.out.print("정답입니다. 다시 한번 하시겠습니까?  1...Yes/ 0...No : ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
