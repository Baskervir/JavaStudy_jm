package finalExercise;

public class ReverseStr {
    public String reverseStr(String str) {
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println(rs.reverseStr("Zbcdefg"));
    }
}
