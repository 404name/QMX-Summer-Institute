SELECT lname,email FROM users WHERE loanNo IN (SELECT loanNo FROM reservation WHERE rstatus = 't');

SELECT *FROM loan WHERE loanNo IN (SELECT loanNo FROM users WHERE classNo = 4);

SELECT u.loanNo,u.lname,u.unitName FROM users u JOIN (SELECT l.loanNo, COUNT(l.loanNo) AS cnt FROM loan l GROUP BY l.loanNo HAVING cnt > 3) b WHERE u.loanNo = b.loanNo;

 select u.loanNo,u.lname,u.unitName from Users u INNER JOIN (select loanNo,count(*) from Loan group by loanNo having count(*)>2) d where u.loanNo=d.loanNo;
 
SELECT loanNo,lname FROM users WHERE loanNo IN (SELECT loanNo FROM loanhist WHERE bookNo = 'A04500049');

SELECT loanNo FROM loan UNION SELECT loanNo FROM loanhist;


SELECT DISTINCT loanNo FROM loan WHERE loanNo NOT IN (SELECT loanNo FROM loanhist);

 alter table Users add amount decimal; 
 
 update Users set amount=100 where loanNo='S02151';
 update Users set amount=110 where loanNo='S02152';
 update Users set amount=100 where loanNo='S02153';
 
 select *
 from Loan into outfile '/var/lib/mysql/loan.txt'FIELDS terminated by '\,';)
