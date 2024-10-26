[LIMIT]
 - 쿼리 결과에서 반환할 행[row]의 수를 제한하는 데 사용
 - 데이터 베이스에서 쿼리의 성능 향상
 - [Pagination]
 - 사용법
   - [SELECT] {컬럼1}, {컬럼2}
     [FROM] {테이블명}
     [LIMIT] {숫자} ;
 - OFFSET과 함께 사용
   - [SELECT] {product_id}, {product_name}
     [FROM] {products}
     [LIMIT] {5} [OFFSET] {10} ;