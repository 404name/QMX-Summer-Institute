SELECT MAX(price)AS max, MIN(price)AS min FROM bookinfo;

SELECT press,count(*) AS nums FROM bookinfo group by press;

SELECT a.ISBN,b.bname,count(*)AS nums FROM books a,bookinfo b WHERE a.ISBN=b.ISBN group by ISBN order by count(*),ISBN DESC;

SELECT a.ISBN,b.bname,count(*)AS nums FROM books a,bookinfo b WHERE a.ISBN=b.ISBN group by ISBN having count(*)>2 order by count(*),ISBN DESC;

SELECT reason,sum(amount) FROM Money WHERE YEAR(billdate)= 2019 group by reason having sum(amount) > 50;
			 
SELECT a.loanno,b.lname,a.bookno,a.borrowdate FROM Loan a,Users b WHERE a.loanNo = b.loanNo;

SELECT a.loanno,b.lname,c.bname,a.borrowdate FROM Loan a,Users b,BookInfo c,Class_User d,Books e WHERE a.loanNo = b.LoanNo && a.bookNo = e.bookNo && e.ISBN=c.ISBN && b.classNo=d.classNo && datediff(now(),a.borrowdate)> d.term  order by a.loanNo;

SELECT bi.ISBN,
			 bi.bname,
			 bi.author,
			 bi.press 
FROM books b
INNER JOIN bookinfo bi
		ON b.ISBN = bi.ISBN
WHERE  b.location = '流通总库'
AND bi.bname REGEXP '数据库';

SELECT u.lname,
			 u.unitName,
			 l.bookNo,
			 l.loanNo,
			 l.borrowDate
FROM users u
LEFT JOIN loan l
		ON u.loanNo = l.loanNo
WHERE u.classNo = 4;

SELECT loanNo,lname
FROM users
WHERE unitName = 
			(SELECT unitName 
			 FROM users
			 WHERE loanNo = 'S06102'
		  );