package Chapter06;
// 배열 변수의 값 표시
public class PrintArrayVariable {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("a = " + a);
        a = null;
        System.out.println("a = " + a);
    }
}

/**
 * 참조형과 객체 (object)
 * 배열은 일반 변수와 달리 객체다
 * 객체를 가리키기 위한 변수의 형이 참조형
 * 배열 변수 출력 -> "[I@10f87f48" 식으로 출력된다
 *
 * final 배열
 * final int[] a = new int[5];
 * 값을 변경할 수 없게 되는 것은 배열 변수 a의 값(참조 위치)이다
 * 배열의 요소값은 변경할 수 없다
 * a[0] = 10;   // OK!
 * a = null;    // Error!
 * a = new int[10]; // Error!
 * **/