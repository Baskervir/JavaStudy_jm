package finalExercise;

public class GetMean {
    public int getMean(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetMean getMean = new GetMean();
        System.out.println("평균값 : " + getMean.getMean(x));
    }
}
