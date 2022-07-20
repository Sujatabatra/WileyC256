/*
selection : selecting rows from the table
projection : selecting columns from the table
*/

select * from employee;

select employeeId,employeeName,department
from employee;

select *
from employee
where salary>50000;

select *
from employee
where department='Sales';

select employeeId,designation
from employee
where department='IT';

select *
from employee
where department='sales';

select *
from employee
where department="sales";

create table salesemployee(
employeeId int primary key,
employeeName varchar(25) not null,
designation varchar(25),
email varchar(25) unique,
salary double
);

insert into salesemployee
select employeeId,employeeName,designation,email,salary
from employee
where department="sales";

select * from salesemployee;