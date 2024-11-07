public class ArrayWithFor2 {
    public int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] testArr = new int[4];
        String str = "";
        int rightResult = 0;
        for (int i = 0; i < 4; i++) {
            testArr[i] = (int)(Math.random() * 100);
            rightResult += testArr[i];
            str += (testArr[i] + ",");
        }

        str = str.substring(0, str.length() - 1);

        ArrayWithFor2 exam = new ArrayWithFor2();
        int Answer = exam.sum(testArr);

        if (Answer == rightResult) {
            System.out.println("정답입니다.");
        } else {
            System.out.println(str + "를 더한 sum의 값이 틀립니다.");
        }
    }
}