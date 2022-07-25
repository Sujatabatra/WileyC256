select employeeName,designation,departmentName
from emp 
Left Join department using(departmentId);

select * from emp;
select * from department;

select employeeName,designation,departmentName
from emp 
Right Join department using(departmentId);
