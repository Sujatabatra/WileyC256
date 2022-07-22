select count(*)
from employee;

select distinct department
from employee;

select count(distinct department)
from employee;

select count(department)
from employee;
/*
sort of bug as we are clubbing multi row output with one row in the following statement
*/
select employeeId,department,count(department)
from employee;

select sum(salary)
from employee;

select min(salary)
from employee;

select * from employee;

select max(salary)
from employee;
