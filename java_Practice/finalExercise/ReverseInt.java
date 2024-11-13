package finalExercise;

public class ReverseInt {
    public int reverseInt(int n) {
        int i = 1;
        int count = 0;
        while (i <= n) {
            i= i * 10;
            count++;
        }
        i = i / 10;
        int arrCount = 0;
        int[] arr = new int[count];
        while (n > 0) {
            arr[arrCount] = n/i;
            n = n%i;
            i = i/10;
            arrCount++;
        }
        int temp = -1;
        for (int i2 = 0; i2 < arr.length; i2++) {
            for (int j = i2 + 1; j < arr.length; j++) {
                if (arr[i2] < arr[j]) {
                    temp = arr[i2];
                    arr[i2] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int value = 0;
        if (arr.length > 0) {
            value = arr[0];
            if (arr.length > 1) {
                for (int i3 = 1; i3 < arr.length; i3++) {
                    value = value * 10 + arr[i3];
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
