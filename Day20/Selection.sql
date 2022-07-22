/*
Selection
Relational Operator : > , <, >= , <= , <>/!= , = , LIKE
Logical Operator : And , or , not
More Operators : BETWEEN, IN, IS
*/
select * 
from employee
where department='IT';

select *
from employee
where department='IT' and salary>150000;

select *
from employee
where department='IT' or salary>150000;

select *
from employee
where salary>=100000 AND salary<=200000;

select *
from employee
where salary BETWEEN 100000 AND 200000;

select *
from employee
where designation="Associate" or designation="Manager" or designation="Executive";

select *
from employee
where designation IN ("Associate","Manager","Executive");

select *
from employee
where department IS Null;

select *
from employee
where department IS NOT Null And designation is not null;

select * 
from employee
where email LIKE '%@xyz.com';

select * 
from employee
where email NOT LIKE '%@xyz.com';
select * 
from employee
where email LIKE '___@xyz.com';