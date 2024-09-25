package Chapter06;

public class DoubleArray {
    public static void main(String[] args) {
        double[] a = new double[5];     //배열 선언

        System.out.println("a[" + 0 + "] = " + a[0]);
        System.out.println("a[" + 1 + "] = " + a[1]);
        System.out.println("a[" + 2 + "] = " + a[2]);
        System.out.println("a[" + 3 + "] = " + a[3]);
        System.out.println("a[" + 4 + "] = " + a[4]);
    }
}

/**
 * ===배열 (Array)===
 * 여러 개의 변수를 하나로 묶어서 사용하기 위한 데이터 구조
 * 일반 변수와 마찬가지로 사용 전에 선언해야 한다
 *
 * 요소에 접근
 * - 배열변수명[인덱스]
 * **/