select * from employee;

USE `wileyc256`;
DROP procedure IF EXISTS `incrementSalary`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `incrementSalary` (in id int)
BEGIN
declare sal int;
select salary into sal from employee 
where employeeId=id;

if sal<50000 then
set sal=sal+.10*sal;
update employee set salary=sal 
where employeeId=id;
select concat('Incremented Salary : '+sal,' for employee id ',id) as details;
else
select concat('No Increment to employee id ',id) as details;
end if;

END$$

DELIMITER ;

call incrementSalary(101);

call incrementSalary(103);