SELECT lname,unitName FROM users;
SELECT * FROM bookinfo;
SELECT * FROM users WHERE unitName = '计算机学院';
SELECT * FROM books WHERE bstatus = 3;
SELECT loanNo,bookNo FROM loan WHERE datediff(now(), borrowDate)>60; 										-- ！！！时间的使用
SELECT bname,author,price FROM bookinfo WHERE press = '清华大学出版社' && `language` = '中文';
SELECT * FROM books WHERE (location = '流通总库' || location = '计算机学院资料室') && bstatus = 0;
SELECT * FROM bookinfo WHERE price >= 30 && price <= 50;
SELECT * FROM loanhist WHERE year(borrowDate) = 2019; 																	-- ！！！year 的使用
SELECT bname,author,press,price FROM bookinfo WHERE author in('兰苓','孙海涛','刘明');  -- ！！！in 的使用
SELECT bname,author,press,price FROM bookinfo WHERE bname like '%数据库%';							-- ！！！like的使用
SELECT bname,author,press,price*1.5 AS price FROM bookinfo WHERE bname like '%数据库%'; -- ！！！AS 的使用
SELECT bname,author,press,price*1.5 AS price FROM bookinfo WHERE bname like '%数据库%' ORDER BY bname; -- 排序
SELECT * FROM money ORDER BY billdate,amount;
SELECT bname,author,press,price FROM bookinfo ORDER BY price DESC LIMIT 5;
SELECT bookinfo.press,COUNT(*) FROM bookinfo,books WHERE books.ISBN = bookinfo.ISBN GROUP BY press; -- 不会???
SELECT COUNT(*) FROM users;
SELECT COUNT(DISTINCT loanNo) FROM loan;
SELECT SUM(amount) FROM money WHERE reason = '办证押金';
SELECT loanNo,AVG(DATEDIFF(returnDate,borrowDate)) FROM loanhist GROUP BY loanNo;
SELECT MAX(price),MIN(price) FROM bookinfo;
SELECT press,COUNT(*) FROM bookinfo GROUP BY press;
SELECT b.bname,COUNT(*) FROM books a,bookinfo b WHERE a.ISBN = b.ISBN GROUP BY a.ISBN ORDER BY COUNT(*) DESC;
SELECT b.bname,COUNT(*) FROM books a,bookinfo b WHERE a.ISBN = b.ISBN GROUP BY a.ISBN HAVING COUNT(*) > 2;
SELECT SUM(amount),reason FROM money WHERE YEAR(billdate) = 2019 GROUP BY reason HAVING SUM(amount) > 50;
SELECT a.loanNo,b.lname,a.bookNo,a.borrowDate FROM loan a,users b WHERE a.loanNo = b.loanNo;
	SELECT a.loanno,b.lname,c.bname,a.borrowdate,DATEDIFF(b.registerDate,a.borrowDate) from Loan a,Users b,BookInfo c,Books d where a.loanNo = b.loanNo && a.bookNo = d.bookNo && d.ISBN=c.ISBN  order by a.loanNo;
	SELECT * FROM books INNER JOIN bookinfo ON books.ISBN = bookinfo.ISBN WHERE bookinfo.bname like '%数据库%';
	SELECT  users.lname,users.unitName,loan.bookNo,loan.borrowDate FROM users LEFT JOIN loan ON users.loanNo=loan.loanNo WHERE users.classNo=4;
	SELECT loanNo,lname FROM users WHERE unitName = (SELECT unitName FROM users WHERE loanNo = 'S06102');
	SELECT lname,email FROM users WHERE loanNo in (SELECT loanNo FROM reservation WHERE rstatus = 't');
	SELECT * FROM loan WHERE loanNo in (SELECT loanNo FROM users WHERE classNo = 4);
	SELECT loanNo,lname,unitName FROM users WHERE loanNo in (SELECT loanNo FROM loan GROUP BY loanNo HAVING COUNT(*) > 3 )
	SELECT loanNo,lname FROM users WHERE loanNo in (SELECT loanNo FROM loanhist WHERE bookNo = 'A04500049');
	SELECT loanNo FROM loan UNION SELECT loanNo FROM loanhist;
	SELECT loanNo FROM loan WHERE loanNo not in (SELECT loanNo FROM loanhist);
	SELECT * FROM loan INTO OUTFILE 'd:\loan.txt';
CREATE TABLE loan_staticsnew (ISBN char(16),loancount int ); 
ALTER TABLE Users ADD amountnew DECIMAL; 