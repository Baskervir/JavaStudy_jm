package finalExercise;

import java.util.Arrays;

public class Divisible {
    public int[] divisible(int[] array, int divisor) {
        int resultArraySize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0)
                resultArraySize++;
        }

        int[] ret = new int[resultArraySize];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisor == 0) {
                ret[index++] = array[i];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println(Arrays.toString(div.divisible(array, 5)));
    }
}
