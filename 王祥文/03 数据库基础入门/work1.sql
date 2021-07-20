SELECT lname,unitName FROM users;

SELECT * FROM bookinfo;

SELECT * FROM users WHERE unitName='计算机学院';

SELECT * FROM reservation WHERE rstatus='t';

SELECT loanNo,bookNo FROM loan WHERE DATEDIFF(now(),borrowDate)>60;

SELECT * FROM books WHERE bstatus='0' and location='流通总库' or location='计算机学院资料室';

SELECT * FROM bookinfo WHERE press='清华大学出版社';

SELECT * FROM bookinfo WHERE price between 30 and 50;

SELECT * FROM loanhist WHERE borrowDate>='2019-1-1 00:00:00' and borrowDate<='2020-1-1 00:00:00';

SELECT * FROM bookinfo WHERE author in ('兰苓','孙海涛','刘明');