package Chapter10.Human;

public class Human {
    private static int counter = 0;
    private String name;
    private int height;
    private int weight;
    private int id;

    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        id = ++counter;
    }

    public String getName() { return name; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }

    public void gainWeight(int w) { weight += w; }
    public void reduceWeight(int w) { weight -= w; }

    public int getId() { return id; }

    public void putData() {
        System.out.println("이름 : " + name);
        System.out.println("신장 : " + height + "cm");
        System.out.println("체중 : " + weight + "kg");
    }
}

/**
 * 클래스 변수 와 인스턴스 변수
 * 이전 Human클래스에 2개의 필드인 counter와 id가 추가
 *
 * 클래스 변수 : counter = 현재까지 부여된 식별 번호 저장
 * static으로 선언된 클래스 변수 = 정적 필드(static field) 라고도 불린다
 * 클래스형의 인스턴스가 아무리 많이 생성되더라도 클래스 변수의 실체는 1개만 만들어진다
 * 클래스 변수 와 클래스형 변수 혼동 주위
 *
 * 인스턴스 변수 : id = 개별 인스턴스의 식별 번호
 * 개별 인스턴스의 식별 번호를 나타내는 것 = static없이 선언한 id
 * 개별 인스턴스의 '일부', 인스턴스 변수
 * 프로그램이 [id = ++counter']을 통과하는 것은 인스턴스를 생성할 때
 * **/