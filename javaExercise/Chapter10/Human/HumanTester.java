package Chapter10.Human;

public class HumanTester {
    public static void main(String[] args) {
        Human gildong = new Human("홍길동", 170, 62);
        Human chulsu = new Human("김철수", 166, 72);

        gildong.putData();
        System.out.println("번호 : " + gildong.getId());

        System.out.println();

        chulsu.putData();
        System.out.println("번호 : " + chulsu.getId());
    }
}
