package Chapter10.Human;

class Id {
    static int counter = 0;
    private int id;

    public Id() {
        id = ++counter;
    }

    public int getId() {
        return id;
    }
}

/**
 * 변수를 비공개로 설정하는 것에 대하여
 * 캡슐화 : OOP의 중요한 원칙 중 하나
 * 외부에서 해당 변수에 직접 접근할 수 없도록 제한
 *
 * 이유와 의미
 * 1. 데이터 보호
 * - 비공개 변수 -> 외부 코드에서 변수 변경 불가 -> 보호 가능
 * 2. 제어된 접근
 * - private로 클래스 내부에서만 접근 가능 -> getter & setter로 외부에서 간접접근 허용
 * 이를 통해 데이터의 유효성 검사 or 추가 로직 수행 가능
 * 3. 유지 보수
 * - 클래스 구현 변경 -> 외부 코드에 영향 X -> 내부 로직 수행 가능
 *
 * **/