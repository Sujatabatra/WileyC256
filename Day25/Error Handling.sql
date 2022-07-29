use wileyc256;

USE `wileyc256`;
DROP procedure IF EXISTS `inputEmployeeDetails`;

USE `wileyc256`;
DROP procedure IF EXISTS `wileyc256`.`inputEmployeeDetails`;
;

DELIMITER $$
USE `wileyc256`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `inputEmployeeDetails`(
in id int,
in na varchar(25),
in desig varchar(25),
in email varchar(25),
in deptt varchar(30),
in sal double)
BEGIN

/* DECLARE <action> HANDLER FOR <condition_value> <statement>;

action : EXIT ,CONTINUE 

condition_value : NOTFOUND, SQLEXCEPTION, SQLWARNING
or condition_value : MYSQL error Codes

statement : statement to be performed if condition_value occured
*/
DECLARE DuplicateValue CONDITION for 1062 ;

declare EXIT handler for DuplicateValue

select concat(id," employee id already exist") Output;

insert into employee 
values(id,na,desig,email,deptt,sal);

select * from employee;
END$$

DELIMITER ;
;



select * from employee;

call inputEmployeeDetails(105,'EEEE','Sr. Executive','eee@xyz.com','IT',35000);

call inputEmployeeDetails(116,'PPPP','Sr. Manager','pppp@xyz.com','IT',235000);

call inputEmployeeDetails(116,'QQQQ','Manager','qqqq@xyz.com','Sales',175000);