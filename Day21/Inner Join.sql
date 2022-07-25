use wileyc256;

select * from department;

select * from emp;
-- equi join
select employeeName,designation,departmentName
from emp 
Inner Join department using(departmentId);

select employeeName,designation,departmentName,salary
from emp e
Inner Join department d on e.departmentId=d.departmentId;

select employeeName,designation,departmentName,salary
from emp e
Inner Join department d on e.departmentId=d.departmentId
and e.salary>50000;

select departmentName,sum(salary)
from emp e
Inner Join department d on e.departmentId=d.departmentId
where d.departmentName!='Marketing'
group by(d.departmentName)
having sum(salary)>220000;


