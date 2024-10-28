[ORDER BY]
 - 쿼리 결과를 특정 컬럼을 기준으로 정렬하는 데 사용
 - [ASC]오름차순 or [DESC]내림차순 으로 지정 가능
 - 사용법
   - [SELECT] {컬럼1}, {컬럼2}
     [FROM] {테이블명}
     [ORDER BY] {컬럼명} [ASC | DESC] ;
 - 복수의 칼럼을 기준으로 정렬 가능
   - [SELECT] {product_id}, {category}, {price}
     [FROM] {products}
     [ORDER BY] {category}, {price} [ASC | DESC] ;
