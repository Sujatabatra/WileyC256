select department,sum(salary)
from employee
group by department;

select department,sum(salary)
from employee
where department IS NOT Null
group by department;

select department,sum(salary)
from employee
where department IS NOT Null
group by department
having sum(salary)>200000;

select department,sum(salary) as TotalSalary
from employee
group by department
order by TotalSalary;

select /*employeeName,*/department,sum(salary) as TotalSalary
from employee
group by department
