package finalExercise;

import java.util.HashSet;

public class HarshadNumber {
    public boolean inHarshad(int num) {
        int hu = num;
        int sum = 0;
        boolean isHarshad = false;
        while (hu > 0) {
            sum += hu % 10;
            hu = hu / 10;
        }

        if (num % sum == 0) {
            isHarshad = true;
        }
        return isHarshad;
    }

    public static void main(String[] args) {
        HarshadNumber hn = new HarshadNumber();

        System.out.println(hn.inHarshad(10));
        System.out.println(hn.inHarshad(18));
        System.out.println(hn.inHarshad(11));
        System.out.println(hn.inHarshad(13));
    }
}
