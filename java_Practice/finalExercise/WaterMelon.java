package finalExercise;

public class WaterMelon {
    public String watermelon(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                result += "수";
            } else {
                result += "박";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        WaterMelon wm = new WaterMelon();
        System.out.println("n이 3인 경우 : " + wm.watermelon(3));
        System.out.println("n이 4인 경우 : " + wm.watermelon(4));
    }
}
