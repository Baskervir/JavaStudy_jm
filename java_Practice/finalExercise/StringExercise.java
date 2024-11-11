package finalExercise;

public class StringExercise {
    String getMiddle(String word) {
        String middleWord = "";
        int index = word.length() / 2;
        if (word.length() % 2 == 0) {
            middleWord = word.substring(index - 1, index + 1);
        } else {
            middleWord = word.substring(index, index + 1);
        }
        return middleWord;
    }

    public static void main(String[] args) {
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
        System.out.println(se.getMiddle("test"));
    }
}
