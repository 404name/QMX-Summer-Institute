-- 第1题
SELECT `lname` AS Lname,`unitName` AS UnitName FROM users;-- AS起别名

-- 第2题
SELECT * FROM bookinfo;-- *查询表的全部字段

-- 第3题
SELECT * FROM users
WHERE  unitName = '计算机学院';

-- 第4题
SELECT * FROM books
WHERE `bstatus` = 3;

-- 第5题
SELECT `loanNo`,`bookNo` FROM loan
where now() - `borrowDate` > 60;-- now()是当前电脑的时间

-- 第6题
SELECT `bname`,`author`,`price` FROM bookinfo
WHERE press = '清华大学出版社' AND 	`language` = '中文';

-- 第7题
SELECT * FROM books
WHERE (`location` = '流通总库' OR `location` = '计算机学院资料室') AND `bstatus` = 0;

-- 第8题
SELECT * FROM bookinfo
WHERE price >= 30 AND price <= 50;

-- 第9题
SELECT * FROM loanhist
WHERE `borrowDate` = 2019;

-- 第10题
SELECT `bname`,`author`,`press`,`price` FROM bookinfo
WHERE `author` IN ('兰苓','孙海涛','刘明');

-- 第11题
SELECT `bname`,`author`,`press`,`price` FROM bookinfo
WHERE `bname` LIKE '%数据库%';

-- 第12题
SELECT `bname`,`author`,`press`,`price`*1.5 AS Price FROM bookinfo
WHERE `bname` LIKE '%数据库%';

-- 第13题
SELECT `bname`,`author`,`press`,`price`*1.5 AS Price FROM bookinfo
WHERE `bname` LIKE '%数据库%'
ORDER BY `bname` ASC;	-- 升序排序

-- 第14题
SELECT * FROM money
ORDER BY `billdate` DESC,`amount` DESC;

-- 第15题
SELECT `bname`,`author`,`press`,`price` FROM bookinfo
ORDER BY `price` DESC 
LIMIT 0,5;

-- 第16题
SELECT DISTINCT press FROM bookinfo;

-- 第17题
SELECT COUNT(lname) FROM users;

-- 第18题
SELECT COUNT(loanNo) FROM loan;

-- 第19题
SELECT SUM(amount) FROM money;

-- 第20题
SELECT lname,AVG(returnDate-borrowDate)
FROM users u
INNER JOIN loanhist l
ON u.loanNo = l.loanNo
GROUP BY lname;

-- 第21题
SELECT MAX(price),MIN(price) FROM bookinfo;

-- 第22题

-- 第23题

-- 第24题

-- 第25题
SELECT amount,reason FROM money
WHERE billdate like '%2019%' AND amount > 50;

-- 第26题
SELECT u.loanNo,lname,bookNo,borrowDate
FROM users AS u
INNER JOIN loan AS l
ON u.loanNo = l.loanNo;

-- 第27题
SELECT u.loanNo,lname,bookNo,borrowDate,(NOW() - borrowDate - cl.term) AS ExpirationDays
FROM users u
INNER JOIN loan l
ON u.loanNo = l.loanNo
INNER JOIN class_user cl
ON u.classNo = cl.classNo
WHERE NOW() - borrowDate - cl.term > 0
ORDER BY u.loanNo ASC;

-- 第28题
SELECT *
FROM bookinfo bi
INNER JOIN books b
ON bi.ISBN = b.ISBN
WHERE b.location = '流通总库' AND bi.bname LIKE '%数据库%';

-- 第29题
SELECT lname,unitName,bookNo,u.loanNo,borrowDate
FROM users u
LEFT JOIN loan l 
ON u.loanNo = l.loanNo
WHERE u.classNo = 4;

-- 第30题
SELECT loanNo,lname FROM users
WHERE unitName = (
	SELECT unitName FROM users
	WHERE loanNo = 'S06102'
);

-- 第31题
SELECT lname,email
FROM users
WHERE loanNo IN (
	SELECT loanNo FROM reservation
	WHERE rstatus = 't'
);

-- 第32题
SELECT *
FROM loan
WHERE loanNo IN (
	SELECT loanNo FROM users
	WHERE classNo = 4
);

-- 第33题
SELECT loanNo,lname,unitName FROM users
WHERE classNo IN (
	SELECT classNo FROM class_user
	WHERE ceilingNum >3
);

-- 第34题
SELECT u.loanNo,lname
FROM users u
LEFT JOIN loan l
ON u.loanNo = l.loanNo
LEFT JOIN loanhist lh
ON u.loanNo = lh.loanNo
WHERE l.bookNo = 'A04500049' OR lh.bookNo = 'A04500049';

-- 第35题
(SELECT loanNo FROM loan) union ALL (SELECT loanNo FROM loanhist);

-- 第36题
SELECT loanNo FROM users
WHERE loanNo IN (
	SELECT loanNo FROM loan
	WHERE loanNo NOT IN (
		SELECT loanNo FROM loanhist
	)
);

-- 第37题

-- 第38题

-- 第39题




