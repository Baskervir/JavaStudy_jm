[
public class 클래스명 extends Exception {
...
}
]

사용자는 [Exception]이나 [runtimeExceotion] 클래스를 상속받아 새로운 [Exception] 클래스를 만들 수 있다.
새로운 [Exception] 클래스를 만드는 이유는 이름 때문이다.
클래스명만 봐도 어떤 오류가 발생했는지 사용자에게 직관적으로 알려주기 위함이다.

[Exception]을 상속받은 클래스를 [Checked Exception]이라고 한다.
에러 처리를 하지 않으면 컴파일 에러가 발생학 때문에 반드시 에러를 처리해야 하는 [Exception]을 말한다.

[RuntimeException]을 상속받아 정의한 [Exception]은 에러 처리를 하지 않아도 컴파일상에서 에러를 발생시키지 않는다.

모든 예외 사항을 적절하게 처리해줘야 프로그램이 안정적으로 수행 가능하다.