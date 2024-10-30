[CREATE 문]
CREATE [TEMPORARY] TABLE [IF NOT EXISTS] tbl_name
    (create_definition,...)
    [table_options]
    [partition_options]

CREATE [TEMPORARY] TABLE [IF NOT EXISTS] tbl_name
    [(create_definition,...)]
    [table_options]
    [partition_options]
    [IGNORE | REPLACE]
    [AS] query_expression

 - [CREATE 문 for 테이블 생성]
    CREATE TABLE 테이블 이름 (
    [열 이름1 데이터 유형],
    [열 이름2 데이터 유형],
    (...)
    ) ;

CREATE [TEMPORARY] TABLE [IF NOT EXISTS] tbl_name
    { LIKE old_tbl_name | (LIKE old_tbl_name) }

 - CREATE DATEBASE [데이터베이스 이름] : CREATE 문의 기본 형식 (데이터베이스 생성)
 - ex) CREATE DATEBASE DoItSQL;
   -> 내비게이터 [Schemas] 탭에서 생성된 데이터베이스 확인 가능 / 안보이면 새로고침

[DROP 문]
DROP [TEMPORARY] TABLE [IF EXISTS]
    tbl_name [, tbl_name] ...
    [RESTRICT | CASCADE]

 - DROP DATEBASE [데이터베이스 이름] : DROP 문의 기본 형식 (데이터베이스 삭제)
 - ex) DROP DATEBASE doitsql;
   -> 쿼리 정상 실행 시 -> 데이터베이스 삭제 -> [Schemas] 탭에서도 데이터베이스 사라진것 확인 가능 
 - DROP DATEBASE 사용시 바로 삭제되며 복수 불가능 [주의] / 백업 파일이 존재시 복구 가능하나 최신 상태와 차이 발생
 - 테이블이 삭제되지 않는 경우 = 삭제하려는 테이블이 다른 테이블과 종속 관계 & 상위 테이블일 경우
   -> 상위 테이블을 삭제하고 싶다 -> 하위 테이블과 종속 관계 제거 & 하위 테이블 모두 삭제

[INSERT 문]
INSERT [LOW_PRIORITY | DELAYED | HIGH_PRIORITY] [IGNORE]
    [INTO] tbl_name
    [PARTITION (partition_name [, partition_name] ...)]
    [(col_name [, col_name] ...)]
    { {VALUES | VALUE} (value_list) [, (value_list)] ... }
    [AS row_alias[(col_alias [, col_alias] ...)]]
    [ON DUPLICATE KEY UPDATE assignment_list]

INSERT [LOW_PRIORITY | DELAYED | HIGH_PRIORITY] [IGNORE]
    [INTO] tbl_name
    [PARTITION (partition_name [, partition_name] ...)]
    SET assignment_list
    [AS row_alias[(col_alias [, col_alias] ...)]]
    [ON DUPLICATE KEY UPDATE assignment_list]

INSERT [LOW_PRIORITY | HIGH_PRIORITY] [IGNORE]
    [INTO] tbl_name
    [PARTITION (partition_name [, partition_name] ...)]
    [(col_name [, col_name] ...)]
    { SELECT ...
    | TABLE table_name
    | VALUES row_constructor_list
    }
    [ON DUPLICATE KEY UPDATE assignment_list]

 - INSERT INTO 테이블 이름 ([열1, 열2, ...]) (VALUES [값1, 값2, ...]) : INSERT 문의 기본 형식 (테이블 생성)

[DB 선택하기] : USE {데이터베이스 이름} -> 사용할 데이터베이스를 선택 후 사용 가능