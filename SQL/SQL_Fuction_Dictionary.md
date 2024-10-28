[문자열 함수]
 - [CONCAT] : 문자열과 문자열을 연결
 - [CAST, CONVERT] : 테이터의 형을 변환
 - [IFNULL, COLAESCE] : NULL을 대체
 - [LOWER / UPPER] : 소문자 / 대문자로 변경
 - [LTRIM / RTRIM] : 왼쪽 / 오른쪽 공백을 제거
 - [TRIM] : 양쪽 공백을 제거
 - [LENGTH] : 문자열의 크기를 반환
 - [CHAR_LENGTH] : 문자열의 개수를 반환
 - [POSITION] : 특정 문자까지의 문자열 길이를 반환
 - [LEFT / RIGHT] : 왼쪽 / 오른쪽으로 지정한 길이만큼 문자열을 반환
 - [SUBSTRING] : 지정한 범위의 문자열을 반환
 - [REPLACE] : 특정 문자를 다른 문자로 대체
 - [REPEAT] : 같은 문자를 반복
 - [SPACE] : 공백 문자를 생성
 - [REVERSE] : 문자열을 역순으로 출력
 - [STRCMP] : 문자열을 비교

[날짜 함수]
 - [CURRENT_DATE] : DB 서버의 현재 날짜 확인
 - [CURRENT_TIME] : DB 서버의 현재 시간 확인
 - [CURRENT_TIMESTAMP or NOW] : DB 서버의 현재 날짜와 시간 확인
 - [DATE_ADD / SUB] : 특정 날짜만큼 더하거나 뺀 결과 반환
 - [DATEDIFF] : 날짜 간의 일수 차이 반환
 - [TIMESTAMPDIFF] : 날짜 간의 시간 차이 반환
 - [DAYNAME] : 지정한 날짜의 요일을 반환
 - [YEAR / MONTH / WEEK / DAY] : 날짜에서 연 / 월 / 주 / 일 값을 반환
 - [DATE_FORMAT] : 날짜 형식을 변환
 - [GET_FORMAT] : 국가나 지역별 날짜 형식 확인

[집계 함수]
 - [COUNT] : 조건에 맞는 데이터 개수를 세어 반환
 - [SUM] : 데이터의 합을 반환
 - [AVG] : 데이터의 평균을 반환
 - [MIN / MAX] : 최솟값 / 최댓값을 반환
 - [ROLLUP] : 부분합 또는 총합을 반환
 - [STDDEV] : 모든 값에 대한 표준편차 반환
 - [STDDEV_SAMP] : 표본에 대한 표준편차 반환

[수학 함수]
 - [ABS] : 절댓값을 반환
 - [SIGN] : 양수 또는 음수인지를 판단
 - [CEILING] / FLOOR : 천장값 / 바닥값을 반환
 - [ROUND] : 반올림한 값을 반환
 - [LOG] : 로그값을 반환
 - [EXP] : e의 n 제곱값을 반환
 - [POWER] : 거듭제곱값을 반환
 - [SQRT] : 제곱근을 반환
 - [RAND] : 난수를 반환
 - [CON / SIN / TAN / ATAN] : 삼각함수

[순위 함수]
 - [ROW_NUMBER] : 유일한 값으로 순위를 부여
 - [RANK] : 우선순위를 고려하지 않고 순위를 부여
 - [DENSE_RANK] : 건너뛰지 않고 순위를 부여
 - [NTILE] : 그룹 순위를 부여

[분석 함수]
 - [LAG / LEAD] : 앞 / 뒤 행을 참조
 - [CUME_DIST] : 누적 분포를 계산
 - [PERCENT_RANK] : 상대 순위를 계산
 - [FIRST / LAST_VALUE] : 첫 / 마지막 행의 값을 반환