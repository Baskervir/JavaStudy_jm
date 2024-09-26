package Chapter10.Math;

public class MinMax {
    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    public static int min(int x, int y, int z) {
        int min = x;
        if (y < min) min = y;
        if (z < min) min = z;
        return min;
    }

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static int[] minIndexArray(int[] a) {
        int min = min(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                count++;
            }
        }

        int[] c = new int[count--];
        for (int i = a.length - 1; count >= 0; i--) {
            if (a[i] == min) {
                c[count--] = i;
            }
        }
        return c;
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static int max(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static int[] maxIndexArray(int[] a) {
        int max = max(a);
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) count++;
        }

        int[] c = new int[count--];
        for (int i = a.length - 1; count >= 0; i--) {
            if (a[i] == max) c[count--] = i;
        }
        return c;
    }
}
