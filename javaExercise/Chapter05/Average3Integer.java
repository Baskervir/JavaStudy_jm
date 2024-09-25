package Chapter05;
/**
 * 3개의 정수값을 읽어서 평균을 실수로 표시합니다
 * **/
import java.util.Scanner;

public class Average3Integer {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Find the average of integer values x, y, z");
        System.out.print("input x : "); int x = stdIn.nextInt();
        System.out.print("input y : "); int y = stdIn.nextInt();
        System.out.print("input z : "); int z = stdIn.nextInt();

        double ave = (x+y+z)/3.0;
        System.out.println("The average of x, y, z is " + ave);
    }
}
