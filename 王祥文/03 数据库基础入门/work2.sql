SELECT * FROM bookinfo WHERE bname like "%数据库%";

SELECT bname,author,press,price*1.5 AS price FROM bookinfo WHERE bname like "%数据库%";

SELECT bname,author,press,price*1.5 AS price FROM bookinfo WHERE bname like "%数据库%";

SELECT * FROM money ORDER BY billdate DESC,amount DESC;

SELECT * FROM bookinfo ORDER BY price DESC limit 0,5;

SELECT * FROM bookinfo WHERE press like "%出版社%";

SELECT count(lname) FROM users;

SELECT count(loanNo) FROM Loan;

SELECT sum(amount) FROM money WHERE reason='办证押金';

SELECT AVG(DATEDIFF(returnDate,borrowDate)) FROM LoanHist group by loanNo;