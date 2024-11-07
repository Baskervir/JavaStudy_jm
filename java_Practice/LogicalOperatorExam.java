public class LogicalOperatorExam {
    public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;

        if (age >= 60 || age <= 19) {
            isDiscount = true;
        } else {
            isDiscount = false;
        }
        return isDiscount;
    }

    public static void main(String[] args) {
        LogicalOperatorExam exam = new LogicalOperatorExam();
        System.out.println(exam.isAgeDiscountable(15));
        System.out.println(exam.isAgeDiscountable(27));
        System.out.println(exam.isAgeDiscountable(61));
    }
}
