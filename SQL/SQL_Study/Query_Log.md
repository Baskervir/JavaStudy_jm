use sakila ;

select
first_name
from
customer ;

select
first_name,
last_name
from
customer ;

select
*
from
customer ;

show columns
from
sakila.customer ;

select
*
from
customer
where
first_name = 'maria' ;

select
*
from
customer
where
address_id = 200 ;

select
*
from
customer
where
address_id < 200 ;

select
*
from
customer
where
first_name = 'maria' ;

select
*
from
customer
where
first_name < 'maria' ;

select
*
from
payment
where
payment_date = '2005-07-09 13:24:07' ;

select
*
from
payment
where
payment_date < '2005-07-09' ;

select
*
from
customer
where
address_id between 5 and 10 ;

select
*
from
payment
where
payment_date between '2005-06-17' and '2005-07-19' ;

select
*
from
payment
where
payment_date = '2005-07-08 07:33:56' ;

select
*
from
customer
where
first_name between 'm' and 'o' ;

select
*
from
customer
where
first_name not between 'm' and 'o' ;

select
*
from
city
where
city = 'Sunnyvale'
and country_id = 103 ;

select
*
from
payment
where
payment_date >= '2005-06-01'
and payment_date <= '2005-07-05' ;

select
*
from
customer c
where
first_name = 'maria'
or first_name = 'linda' ;

select
*
from
customer c
where
first_name = 'maria'
or first_name = 'linda'
or first_name = 'nancy' ;

select
*
from
customer c
where
first_name in ('maria', 'linda', 'nancy') ;

select
*
from
city c
where
country_id = 103
or country_id = 86
and city in ('Cheju', 'Sunnyvale', 'Dallas') ;

select
*
from
city c
where
country_id = 86
or country_id = 103
and city in ('Cheju', 'Sunnyvale', 'Dallas') ;

select
*
from
city c
where
(country_id = 103
or country_id = 86)
and city in ('Cheju', 'Sunnyvale', 'Dallas') ;

select
*
from
city
where
country_id in (103, 86)
and city in ('Cheju', 'Sunnyvale', 'Dallas') ;

select
*
from
address a ;

select
*
from
address a
where
address2 = null ; # NULL은 정의되지 않은 값 -> 일반적인 연산자로 조회 불가

select
*
from
address a
where
address2 is null ;

select * from address a where address2 is not null ;

select * from address where address2 = ''; # 공백은 null이 아니다 -> '=' 로 조회 가능

select * from customer c order by first_name ;

select * from customer c order by last_name ;

select * from customer c order by store_id, first_name ; # 열 입력 순서에 따라 우선순위 변경된다

select * from customer c order by first_name, store_id ;  # 열 입력 순서에 따라 우선순위 변경된다

select * from customer c order by first_name asc ; # ASC : 오름차순 (생략 가능)

select * from customer c order by first_name desc ; # DESC : 내림차순 (생략 불가)

select * from customer c order by store_id desc, first_name asc ;

select * from customer c order by store_id desc, first_name asc limit 10 ; # limit로 출력할 row수 설정

select * from customer c order by customer_id asc limit 100, 10 ; # 출력 제한 & 범위 지정

select * from customer c order by address_id asc limit 10 offset 100 ; # 구간지정, offset는 limit와 항상 함께 쓰인다

select * from customer c where first_name like 'a%' ; # like로 일부 키워드를 통해 조회 가능 / A% : A로 시작 / %A : A로 끝 / %A% : A포함

select * from customer c where first_name like '%a' ;

select * from customer c where first_name like '%ra' ;

select * from customer c where first_name like '%a%' ; # a 포함에서는 a 시작도 조회 된다

select * from customer c where first_name not like 'a%' ;

select special_features from film group by special_features ;

select rating from film group by rating ;

select special_features, rating from film group by special_features, rating ;

select special_features, count(*) as cnt from film group by special_features ;

select special_features, rating, count(*) as cnt from film group by special_features, rating order by special_features, rating, cnt desc ;

#select special_features, rating, count(*) as cnt from film group by rating ; 그룹화 할 시에 반드시 기준이 되는 열이 필요 -> select 문에 사용한 열을 group by 문에도 사용해야 한다

select 