use wileyc256;

USE `wileyc256`;
DROP procedure IF EXISTS `demoLoop`;

USE `wileyc256`;
DROP procedure IF EXISTS `wileyc256`.`demoLoop`;
;

DELIMITER $$
USE `wileyc256`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE `demoLoop`()
BEGIN
declare x int;
declare str varchar(50);

set x=1;
set str=" ";

loop_lable: loop
if x>10 then
	leave loop_lable;
end if;

set x=x+1;
if(x mod 2) then
	iterate loop_lable;
else
	set str=concat(str,x,',');
 end if;
end loop;
select str;
END$$

DELIMITER ;
;



call demoLoop();

CREATE DEFINER=`root`@`localhost` PROCEDURE `factorial`(in num int)
BEGIN
declare fact int;
declare n int;
set n=num;
set fact=1;
label_loop:loop
if num=1 then
	leave label_loop;
else
	set fact=fact*num;
	set num=num-1;
end if;
iterate label_loop;
end loop;
select concat("Factorial of ",n," : ",fact) output;
END;
call factorial(4);