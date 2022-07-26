use wileyc256;
select * from employee;

update ignore employee
set designation="Sr. Associate" ,
department="marketing"
where employeeId=104; 
-- error : 1093 will come in the following query and subquery an update statement is making use of same table
update employee
set designation=(select designation from emp where employeeName="AAAA")
where employeeId=(select employeeId from employee where employeeId=104);

-- solution of 1093 error
update employee
set designation=(select designation from emp where employeeName="AAAA")
where employeeId=(select * from (select employeeId from employee where employeeId=104) as X);

-- or
UPDATE EMPLOYEES A INNER JOIN EMPLOYEES B
SET A.SALARY = A.SALARY + 5000 WHERE A.MANAGER_ID = B.EMPLOYEE_ID;

select * from emp;


