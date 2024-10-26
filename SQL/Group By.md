[GROUP BY]
 - 데이터를 그룹화하여 집계함수를 적용할 수 있게 한다.
 - 특 정 칼럼을 기준으로 레코드를 그룹화 -> 각 그룹에 대해 집계 연산 수행
- 사용법
    - [SELECT] {칼럼1}, {집계함수(칼럼2)} [FROM] {테이블명} [GROUP BY] {칼럼1} ;
- 집계 함수
   - [COUNT()] : 레코드 수 세기
   - [SUM()] : 총합 계산
   - [AVG()] : 평균 계산
   - [MAX()] : 최대값 계산
   - [MIN()] : 최소값 계산
- [HAVING]절
  - [GROUP BY]로 그룹화한 결과에 대해 조건 설정 가능
  - 예시
    - SELECT product_id, AVG(sales_amount) AS avg_sales
      FROM sales
      GROUP BY product_id
      HAVING AVG(sales_amount) > 1000;
    # 이 쿼리는 평균 판매량이 1000 이상인 제품 ID와 평균 판매량을 반환합니다.