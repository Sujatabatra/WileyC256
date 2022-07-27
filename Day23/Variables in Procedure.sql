USE `wileyc256`;
DROP procedure IF EXISTS `getEmployeeTotalSalary`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `getEmployeeTotalSalary` ()
BEGIN

declare totalSalary int;

select sum(salary) into totalSalary from employee;

select concat('Total Salary of all Employees : ',totalSalary) as Details;
END$$

DELIMITER ;

call getEmployeeTotalSalary();

call getEmployeeSalaryDetails(102);