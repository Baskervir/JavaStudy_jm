Package
- 클래스명 등의 형명은 패키지라는 논리적인 이름 공간(name space)에 속한다
- [패키지-클래스]의 관계는 OS의 [디렉터리(폴더)-파일]관계에 해당한다
- [GregorianCalendar]클래스와 [Random]클래스는 [java]패키지 안의 [util]패키지에 속한다
- 단일형 임포트 선언 : [import 완전 한정 명칭;]
- 온 디맨드형 임포트 선언 : [import 패키지명.*;]
- 정적 임포트 선언 : [import static 패키지명.형명.식별자명;], [import static 패키지명.형명.*;]
- 