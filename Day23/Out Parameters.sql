USE `wileyc256`;
DROP procedure IF EXISTS `getTotalEmployeesByDepartmentName`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `getTotalEmployeesByDepartmentName` (in deptt varchar(30),
out totalEmp int)
BEGIN

select count(*) into totalEmp
from employee
where department=deptt;

END$$

DELIMITER ;

call getTotalEmployeesByDepartmentName('IT',@totalEmp);


select @totalEmp;


DROP procedure IF EXISTS `callGetTotalEmployeesByDepartmentName`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `callGetTotalEmployeesByDepartmentName` (in deptt varchar(30))
BEGIN

call getTotalEmployeesByDepartmentName(deptt,@totalEmp);

select concat('Total Employees in department',deptt,' : ',@totalEmp) as count;
END$$

DELIMITER ;

call callGetTotalEmployeesByDepartmentName('IT');

