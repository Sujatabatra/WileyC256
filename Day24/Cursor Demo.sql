USE `wileyc256`;
DROP procedure IF EXISTS `getEmployeeNames`;

USE `wileyc256`;
DROP procedure IF EXISTS `wileyc256`.`getEmployeeNames`;
;

DELIMITER $$
USE `wileyc256`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `getEmployeeNames`(in deptt varchar(30),
out empNames varchar(256))
BEGIN
declare ename varchar(30);
declare finished int default 0;

-- 1. declare cursor
declare curEmpName
cursor for
select employeeName
from employee
where department=deptt;

declare continue handler for NOT FOUND set finished=1;
set empNames=" ";
-- 2. open cursor
open curEmpName;


-- 3.fetch (till cursor is empty)
getEName: loop

fetch curEmpName into ename; 

if finished = 1 then
  leave getEName;
end if;
 
 set empNames=concat(empNames,ename,",");

end loop;

-- 4. close the cursor
close curEmpName;
END$$

DELIMITER ;
;





set @empNames="";
call getEmployeeNames('IT',@empNames);

select @empNames;

select * from employee
where department="IT";