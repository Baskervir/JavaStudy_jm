package finalExercise;

public class PrintTriangle {
    public String printTriangle(int num) {
        String star = "";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                star += "*";
            }
            star += "\n";
        }
        return star;
    }

    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println(pt.printTriangle(3));
    }
}
