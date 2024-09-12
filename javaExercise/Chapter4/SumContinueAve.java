package Chapter4;
/**
 * 정수값을 지정한 수 만큼 읽어옵니다
 * 음수를 제외한 값들의 합계와 평균을 구합니다
 * **/
import java.util.Scanner;

public class SumContinueAve {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("add Integers");
        System.out.print("How many add?: ");
        int n = stdIn.nextInt();

        int sum = 0;
        int count = 0;
        int i;
        for (i = 1; i <= n; i++) {
            System.out.print("Integer: ");
            int t = stdIn.nextInt();
            if (t < 0) {
                System.out.println("You can't add negative");
                continue;
            }
            sum += t;
            count++;
        }
        System.out.println("Sum is " + sum);
        if (i != 0) System.out.println("Aveage is " + sum/count);
    }
}