package Chapter06;
/**
 * 프린터를 관리하는 프로그램을 만들어보자
 * **/
public class Printer {
    public Printer() {}

    public void print(Resource r) {
        ...
    }
}
/**
 * 프린터는 하나. 이 클래스를 사용해 프린터를 이용하기 위해 클라이언트 프로그램에서 new Printer() 가 반드시 한 번만 호출되야 한다
 * **/

public class Printer {
    private Printer() {}

    public void print(Resource r) {
        ...
    }
}
/**
 * 이렇게 작성하면 외부에서는 new Printer() 사용 불가능. 그러나 인스턴스 하나는 반드시 만들어야 하는 상황
 * 인스턴스를 만들어 외부에 제공해줄 메서드가 필요하다
 * **/

public class Printer{
    private static Printer printer = null;
    private Printer() {}

    public static Printer getPrinter() {
        if (printer == null)
            printer = new Printer();
        return printer;
    }

    public void print(Resource r) {
        ...
    }
}
/**
 * getPrinter 메서드는 프린터 인스턴스가 생성되어 있는지를 검증한다
 * getPrinter 메서드와 printer 변수가 static타입으로 선언 > 클래스의 인스턴스를 통하지 않고서도 메서드 실행 가능
 * **/