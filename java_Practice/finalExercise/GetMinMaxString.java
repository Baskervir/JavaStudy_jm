package finalExercise;

public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] strArr = str.split(" ");
        int maxValue = Integer.parseInt(strArr[0]);
        int minValue = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            int value = Integer.parseInt(strArr[i]);

            if (maxValue < value) {
                maxValue = value;
            }
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue + " " + maxValue;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        String str2 = "-1 -2 -3 -4";
        GetMinMaxString minMax = new GetMinMaxString();
        System.out.println("최댓값과 최솟값은? " + minMax.getMinMaxString(str));
        System.out.println("최댓값과 최솟값은? " + minMax.getMinMaxString(str2));
    }
}
