use wileyc256;

select * from employee;

create view SalesView
as
select employeeId,employeeName,designation,email,salary
from employee
where department="Sales";

select * from salesview;

update salesview
set salary=70000
where employeeId=103;

create view ITView(eId,eName,desig,email,basicSalary)
as
select employeeId,employeeName,designation,email,salary
from employee
where department="IT";

select * from itview;

update itview
set basicSalary=60000
where eId=101;

select * from employee;

create or replace view ITView(eId,eName,desig,email,salary,hr,pf,total)
as
select employeeId,employeeName,designation,email,salary,.15*salary,.12*salary,salary+.15*salary-.12*salary
from employee
where department="IT";

select * from itview;

drop view itview;