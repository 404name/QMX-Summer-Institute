SELECT
	lname,
	unitName 
FROM
	users;
SELECT
	* 
FROM
	books;
SELECT
	* 
FROM
	users 
WHERE
	unitname = '计算机学院';
SELECT
	* 
FROM
	books 
WHERE
	bstatus = '3';
SELECT
	* 
FROM
	bookinfo 
WHERE
	press = '清华大学出版社';
SELECT
	* 
FROM
	books 
WHERE
	bstatus = '0' 
	AND location = '流通总库' 
	OR location = '计算机学院资料室';
SELECT
	* 
FROM
	bookinfo 
WHERE
	price < 50 AND price > 30;
SELECT
	* 
FROM
	loanhist 
WHERE
	borrowdate >= '2019-01-01' 
	AND returndate <= '2019-12-31';
SELECT
	bname,
	author,
	press,
	price 
FROM
	bookinfo 
WHERE
	author = '兰苓' 
	OR author = '孙海涛' 
	OR author = '刘明';
SELECT
	bname,
	author,
	press,
	price 
FROM
	bookinfo 
WHERE
	bname LIKE '%数据库%';
UPDATE bookinfo 
SET price = price * 2 
WHERE
	bname LIKE '%数据库';
SELECT
	bname,
	author,
	press,
	price AS price 
FROM
	bookinfo 
WHERE
	bname LIKE '%数据库%';
SELECT
	bname,
	author,
	press,
	price 
FROM
	bookinfo 
WHERE
	bname LIKE '%数据库%' 
ORDER BY
	bname;
SELECT
	* 
FROM
	money 
ORDER BY
	billdate DESC,
	amount ASC;
SELECT
	bname,
	author,
	press,
	price 
FROM
	bookinfo 
ORDER BY
	price DESC 
	LIMIT 5;
SELECT DISTINCT
	press 
FROM
	bookinfo;
SELECT
	count(*) 
FROM
	users;
SELECT
	count( bstatus ) 
FROM
	books 
WHERE
	bstatus = '1';
SELECT
	sum( amount ) 
FROM
	money 
WHERE
	reason = '办证押金';
SELECT
	max( price ) 
FROM
	bookinfo;
SELECT
	min( price ) 
FROM
	bookinfo;
	SELECT DISTINCT press FROM bookinfo;
SELECT count(*) FROM bookinfo WHERE press = '高等教育出版社';
SELECT count(*) FROM bookinfo WHERE press = '机械工业出版社';
SELECT count(*) FROM bookinfo WHERE press = '中国铁道出版社';
SELECT count(*) FROM bookinfo WHERE press = '北京大学出版社';
SELECT count(*) FROM bookinfo WHERE press = '清华大学出版社';
SELECT count(*) FROM bookinfo WHERE press = '华中理工大学出版社';
SELECT count(*) FROM bookinfo WHERE press = '首都经济贸易大学出版社';
SELECT count(*) FROM bookinfo WHERE press = '中国人事出版社';
SELECT count(*) FROM bookinfo WHERE press = '上海财经大学出版社';

SELECT
	amount,
	reason 
FROM
	money 
WHERE
	billdate BETWEEN '2019-01-01' 
	AND '2019-12-31' 
	AND amount > 50;
SELECT
	B.ISBN,
	Bo.bname,
	Bo.author,
	Bo.press 
FROM
	Books B
	INNER JOIN BookInfo Bo ON B.ISBN = Bo.ISBN 
WHERE
	Bo.bname LIKE '%数据库%';
SELECT
	u.lname,
	u.unitName,
	l.bookNo,
	l.loanNo,
	l.borrowDate 
FROM
	Users u
	LEFT JOIN Loan l ON u.loanNo = l.loanNo 
WHERE
	classNo = 4 
ORDER BY
	unitName;
SELECT
	loanNo,
	lname 
FROM
	Users 
WHERE
	unitName = ( SELECT unitName FROM Users WHERE loanNo = 'S06102' );
SELECT
	lname,
	email 
FROM
	Users 
WHERE
	loanNo IN ( SELECT loanNo FROM Reservation WHERE rstatus = 'T' ) SELECT
	bookNo,
	loanNo,
	borrowDate 
FROM
	Loan 
WHERE
	loanNo IN (
	SELECT
		loanNo 
	FROM
		Users 
	WHERE
	classNo = ( SELECT classNo FROM Class_User WHERE cname = '教师' ));
SELECT
	u.loanNo,
	u.lname,
	u.unitName 
FROM
	Users u
	INNER JOIN ( SELECT loanNo, count(*) FROM Loan GROUP BY loanNo HAVING count(*)> 2 ) d 
WHERE
	u.loanNo = d.loanNo;
SELECT
	loanNo,
	lname 
FROM
	Users 
WHERE
	loanNo IN ( SELECT loanNo FROM LoanHist WHERE bookNo = 'A04500049' );
SELECT
	loanNo 
FROM
	Loan UNION
SELECT
	loanNo 
FROM
	LoanHist;
SELECT
	loanNo 
FROM
	Loan UNION
SELECT
	loanNo 
FROM
	LoanHist;
SELECT DISTINCT
	loanNo 
FROM
	Loan 
WHERE
	loanNo NOT IN ( SELECT loanNo FROM LoanHist );
SELECT
	* 
FROM
	Loan INTO OUTFILE '/var/lib/mysql/loan.txt' FIELDS TERMINATED BY '\,';