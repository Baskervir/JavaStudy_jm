package Chapter05;
/**
 * float형 변수와 double형 변수 값을 읽어서 표시합니다
 * 소수표현 최대 자리 이후로 자릅니다 (반올림)
 * **/
import java.util.Scanner;

public class FloatDoubleScanPrint {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Variable x is Float type\n Variable y is Double type");
        System.out.print("input x : ");
        float x = stdIn.nextFloat();
        System.out.print("input y : ");
        double y = stdIn.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
