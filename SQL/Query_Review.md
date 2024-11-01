select * from city c order by country_id asc ;
select country_id, count(city_id) as cnt from city c group by country_id order by cnt desc ;

select * from film f ;

select * from language l ;

select l.name, count(f.film_id) as cnt from film f left join language l on l.language_id = f.language_id group by f.language_id order by cnt asc ;

select * from film f group by language_id ;

select
(select count(*) from film f where f.language_id = 1) as cnt_language_id_equals_1,
(select count(*) from film f where f.language_id != 1) as cnt_language_id_not_equals_1

select *
from `language` l

select * from payment ;

select * from rental ;

select * from customer ;

#문제
select p.customer_id, count(*), date_format(max(r.rental_date), '%Y-%m-%d') as Last_Rental_Date, concat(c.first_name, c.last_name)
from payment p left join rental r ON p.rental_id = r.rental_id left join inventory i on r.inventory_id = i.inventory_id left join film f on f.film_id = i.film_id left join customer c on c.customer_id = p.customer_id group by customer_id ;

select * from customer c limit 10, 3 ;

select * from customer c order by first_name limit 10 ;

select s.store_id,
from customer c left join rental r on r.customer_id = c.customer_id left join store s on s.store_id = c.store_id
group by c.store_id
;

select * from store s ;

select i.store_id, r.customer_id, c.first_name, r.rental_date
from inventory i left join rental r on i.inventory_id = r.inventory_id left join customer c on c.customer_id = r.customer_id
where i.store_id = 1
order by rental_date desc, c.customer_id
limit 10;