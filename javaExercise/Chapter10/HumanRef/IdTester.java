package Chapter10.HumanRef;

public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id();

        System.out.println("a의 식별 번호 : " + a.getId());
        System.out.println("b의 식별 변호 : " + b.getId());

        System.out.println("마지막으로 부혀한 식별 번호 = " + Id.getMaxId());
        System.out.println("마지막으로 부여한 식별 번호 = " + a.getMaxId());
        System.out.println("마지막으로 부여한 식별 번호 = " + b.getMaxId());
    }
}

/**
 * 클래스 메서드
 * 마지막 식별 번호(counter 값)를 반환하는 메서드 추가
 * counter를 private로 선언 -> 비공개
 * getMaxId() 는 static로 선언 -> 특정 인스턴스에 소속 X [클래스 변수(정적 필드)와 비슷한 성질]
 * 이러한 메서드 = 클래스 메서드(static method)
 * 클래스 메서드는 static로 선언
 * 클래스명.메서드명()으로 호출 (클래스형 변수명.메서드명()도 가능하나 주로 전자 사용)
 *
 * 비정적 메서드(인스턴스 메서드)
 * 개별 인스턴스에 소속
 * '자원이 소속된 인스턴스의 변수, 메서드'와 '모두가 공유하는 변수, 메서드' 양쪽에 접근 가능
 * 비정적 필드, 정적 필드, 비정적 메서드, 정적 메서드 에 모두 접근 가능
 *
 * 정적 메서드(클래스 메서드)
 * 인스턴스에 속하지 않는다 -> '자신이 소속된 인스턴스의 변수, 메서드' 를 가지지 않는다
 * '모두가 공유하는 변수, 메서드'에만 접근 가능
 * 정적 필드, 정적 메서드는 접근 가능 [비정적 필드, 비정적 메서드는 접근 불가]
 *
 * ex)
 * 클래스 메서드 getMaxId() 안에선 인스턴스 변수 id에 접근 불가
 * 어떤 인스턴스의 id에 접근해야 할지 결정 불가
 * 단, 자신이 속한 클래스형의 인스턴스 참조를 매개 변수 r로 받아서 r.id 형식으로 인스턴스 변수에 접근은 가능
 * **/