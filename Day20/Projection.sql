/*
Projection
*/
use wileyc256;

describe employee;

select employeeId,
employeeName,
salary,
salary*12 as AnnualSalary
from employee;

select employeeId,
employeeName,
salary,
salary*12 as 'Annual Salary'
from employee;


select employeeId,
employeeName,
salary,
(salary+100)*12 as 'Incremented Annual Salary'
from employee;

select
concat(employeeName,' is working in ',department,' department as a ',designation) as "Employee Details"
from employee;

select
1+1
from dual;

select
now();

