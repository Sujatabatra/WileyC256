use wileyc256;

select * from emp;
-- PROCEDURE : PL/SQL
USE `wileyc256`;
DROP procedure IF EXISTS `firstProcedure`;

USE `wileyc256`;
DROP procedure IF EXISTS `wileyc256`.`firstProcedure`;
;

DELIMITER $$
USE `wileyc256`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `firstProcedure`()
BEGIN
update emp set employeeName="Amita"
where employeeId=1;

insert into emp
values(6,'Falak','Associate','falak@abc.com','D004',45000);

END$$

DELIMITER ;


call firstProcedure();

select * from emp;

DELIMITER $$
-- USE wileyc256$$
CREATE PROCEDURE secondProcedure()
BEGIN
select employeeName,designation
from emp;
END$$

DELIMITER ;

call secondProcedure();

DELIMITER ;

select * from employee ;

DELIMITER $$

select * from employee $$

DELIMITER ;
