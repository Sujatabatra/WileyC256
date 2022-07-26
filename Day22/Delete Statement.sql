use wileyc256;

select * from employee;

select * from salesemployee;

delete from salesemployee;


insert into salesemployee(employeeId,employeeName,designation,email,salary)
select employeeId,employeeName,designation,email,salary
from employee 
where department="Sales";

set sql_safe_updates=0;

delete from salesemployee LIMIT 2;

delete from emoplyee 
where department is null;
