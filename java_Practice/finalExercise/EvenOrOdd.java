package finalExercise;

public class EvenOrOdd {
    String evenOrOdd(int num) {
        String result = "";
        if (num % 2 == 0) {
            result = "Even";
        } else if (num % 2 != 0) {
            result = "Odd";
        } else {
            System.out.println("num은 0 이상이어야 합니다. ");
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
    }
}
