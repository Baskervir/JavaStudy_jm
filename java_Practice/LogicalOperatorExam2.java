public class LogicalOperatorExam2 {
    public boolean isAgeTwenties(int age) {
        boolean isTwentise = true;
        if (age < 30 && age > 19) {
            isTwentise = true;
        } else {
            isTwentise = false;
        }
        return isTwentise;
    }

    public static void main(String[] args) {
        LogicalOperatorExam2 exam = new LogicalOperatorExam2();
        System.out.println(exam.isAgeTwenties(19));
        System.out.println(exam.isAgeTwenties(25));
        System.out.println(exam.isAgeTwenties(30));
    }
}