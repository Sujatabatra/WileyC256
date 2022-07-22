select * 
from employee
order by designation;

select * 
from employee
order by designation asc;

select * 
from employee
order by designation desc;

select employeeId,employeeName,salary
from employee
order by designation;

SELECT 
    employeeId, employeeName, department, designation
FROM
    employee
ORDER BY department , designation DESC;

select employeeId,employeeName,department,designation,salary 
from employee
order by department desc,designation desc,salary desc;

select * 
from employee;

select employeeId,employeeName,department,designation
from employee
order by field(department,
'IT',
'Sales',
'Marketing',
'HR') ;

select employeeId,employeeName,department,designation
from employee
order by field(department,
'IT',
'Sales') ;