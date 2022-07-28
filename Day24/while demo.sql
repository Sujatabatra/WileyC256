USE `wileyc256`;
DROP procedure IF EXISTS `whileDemo`;

DELIMITER $$
USE `wileyc256`$$
CREATE PROCEDURE `whileDemo` ()
BEGIN
declare x int;
declare str varchar(50);

set x=1;
set str=" ";
while x<10 do
	set x=x+1;
    if(x mod 2=0) then
    set str=concat(str,x,',');
    end if;
end while;
select str as "Output";
END$$

DELIMITER ;

call whileDemo();