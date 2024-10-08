Package
- 클래스명 등의 형명은 패키지라는 논리적인 이름 공간(name space)에 속한다
- [패키지-클래스]의 관계는 OS의 [디렉터리(폴더)-파일]관계에 해당한다
- [GregorianCalendar]클래스와 [Random]클래스는 [java]패키지 안의 [util]패키지에 속한다
- 단일형 임포트 선언 : [import 완전 한정 명칭;]
- 온 디맨드형 임포트 선언 : [import 패키지명.*;]
- 정적 임포트 선언 : [import static 패키지명.형명.식별자명;], [import static 패키지명.형명.*;]
- import static java.lang.System.out.println; //컴파일 오류 : println = [인스턴스 메서드]
- [System] : java.lang 패키지에 속한 클래스
- [System.out] : System 클래스의 클래스(정적) 변수 (형은 PrintStream 클래스형)
- [System.out.println] : PrintStream 클래스의 인스턴스 메서드
- 패키지 선언 : 소스 프로그램에서 선언한 클래스를 특정 패키지에 포함시키는 것 = [package 패키지명;]
- [컴파일 단위] : 개별 소스 파일에 담겨 있는 소스 프로그램 (번역 단위라고도 함)
- [unnamed package] : 소스 파일에 패키지 선언이 없는 경우 = 해당 파일 내에 선언된 클래스는 무명 클래스에 포함
- [클래스의 접근 제어] 
    - [public]클래스 : [public]으로 선언한 클래스. 패키지와 관계없이 사용 가능. 공개 접근
    - 비[public]클래스 : [public]없이 선언한 클래스. 속해 있는 패키지 이외의 패키지에서는 사용 불가. 패키지 접근
- 멤버의 접근 제어
    - [public] : 공개 접근
    - [protected] : 한정 공개 접근
    - [default] : 패키지 접근
    - [private] : 비공개 접근
- Wrapper Class : [Character], [Byte], [Short], [Integer], [Long], [Float], [Double], [Boolean]
    - 각 형은 기본형과 일대일로 대응, 기본형을 래핑한다
    - 기본형의 특성 정보를 클래스 변수를 통해 제공 (Boolean형 제외)
    - 대응하는 기본형의 값을 지니는 클래스형 인스턴스를 새성 가능
    - 각종 처리를 메서드로 제공