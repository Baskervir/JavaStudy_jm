package Chapter05;
// int형 변환에 실수값 대입
public class FloatToInteger {
    public static void main(String[] args) {
        int a;

        a = (int) 10.0;
        // a = 10.0; -> 오류

        System.out.println("a = " + a);
    }
}

/**
 * ===기본형의 축소 변환===
 * •short -> byte, char
 * •char -> byte, short
 * •int -> byte, short, char
 * •long -> byte, short, char, int
 * •float -> byte, short, char, int, long
 * •double -> byte, short, char, int, long, float
 *  = 축소 변환에선 원칙적으로 캐스트가 필수
 * **/