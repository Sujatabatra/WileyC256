describe  salesemployee;

alter table salesemployee
add bloodgroup varchar(10),
add gender varchar(8);

alter table salesemployee
modify employeeName varchar(30) not null;

alter table salesemployee
change employeeName empName varchar(25) not null;

alter table salesemployee
change employeeId empId int;

alter table salesemployee
drop column bloodgroup;

alter table salesemployee
rename salesemp;

describe salesemp;

select * from salesemp;

alter table salesemp
add constraint check_sal check(salary>0);

insert into salesemp
values(101,'AAAA','Executive','aaa@xyz.com',25000,'male');

insert into salesemp
values(102,'BBBB','Sr. Executive','bbb@xyz.com',-25000,'male');

alter table salesemp
drop constraint check_sal;

insert into salesemp
values(102,'BBBB','Sr. Executive','bbb@xyz.com',-25000,'male');

