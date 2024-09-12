package Chapter5;

import java.util.Scanner;

public class Average3IntegerWithCasting {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Find the average of integer values x, y, z");
        System.out.print("input x : "); int x = stdIn.nextInt();
        System.out.print("input y : "); int y = stdIn.nextInt();
        System.out.print("input z : "); int z = stdIn.nextInt();

        double ave = (double)(x+y+z)/3;
        System.out.println("The average of x, y, z is " + ave);
    }
}
