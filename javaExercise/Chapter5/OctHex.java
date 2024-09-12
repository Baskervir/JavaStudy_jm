package Chapter5;
/**
 * 입력받은 정수값을 8진수와 16진수로 변환합니다
 * **/
import java.util.Scanner;

public class OctHex {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Input value -> Oct Num & Hex Num");
        System.out.print("Input Integer : ");
        int x = stdIn.nextInt();

        System.out.printf("Oct Num is %o\n", x);
        System.out.printf("Hex Num is %x\n", x);
    }
}
