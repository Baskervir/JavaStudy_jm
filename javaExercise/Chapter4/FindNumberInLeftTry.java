package Chapter4;

import java.util.Random;
import java.util.Scanner;

public class FindNumberInLeftTry {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        final int MAX_NO = 6;
        int leftTry = MAX_NO;
        int no = rand.nextInt(100);

        System.out.println("Start Find_Number");
        System.out.println("Find Number 0 to 99");

        int x;
        do {
            System.out.println("Left Chance is " + (leftTry--));
            System.out.print("Enter the number you think is correct : ");
            x = stdIn.nextInt();

            if (x > no) System.out.println("Down!");
            else if (x < no) System.out.println("Up!");
        } while (x != no && leftTry > 0);

        if (x == no) System.out.print("You got Correct in " +(MAX_NO - leftTry) + " times");
        else System.out.println("Fail... The Number is " + no);
    }
}
