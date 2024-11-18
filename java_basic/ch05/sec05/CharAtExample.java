package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char ss = ssn.charAt(6);
        switch (ss) {
            case '1', '3':
                System.out.println("남자입니다.");
                break;
            case '2', '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
