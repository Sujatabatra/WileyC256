select * from employee;

select salary 
from employee
where employeeName="BBB";

select *
from employee
where salary>125000;

select *
from employee
where salary>(select salary 
from employee
where employeeName="BBB");


/* display the details of all the employees having same designation 
as that of employees working in IT Department*/

select designation
from employee
where department="IT";

select * 
from employee
where designation IN(select designation
from employee
where department="IT");