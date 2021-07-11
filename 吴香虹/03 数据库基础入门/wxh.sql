-- 1、	从USER表中查询所有用户的姓名和单位。
-- 2、	查询所有图书的信息。
-- 3、	查询单位为“计算机学院”的用户的全部信息。
-- 4、	查询已经预约但还没有借出的书的信息。
-- 5、	查询借书超过60天且还没有归还的借阅证号、书号。
-- 6、	查询“清华大学出版社”出版的所有中文书的书名、作者、价格。
-- 7、	查询在流通总库或者是属于计算机学院资料室的尚未借出的书。
-- 8、	查询价格在30元到50元之间的书。
-- 9、	查询2019年的借阅历史情况。
-- 10、	查询作者为兰苓、孙海涛、刘明编写的书的书名、作者、出版社和价格。
-- 11、	查询书名包含“数据库”的所有书名、作者、出版社和价格。
-- 12、	查询书名包含“数据库”的所有书名、作者、出版社及价格*1.5 ,并将最后一列重命名为price。
-- 13、	将上题的结果按书名排序。
-- 14、	查询收费情况，结果先按日期降序排序，同一天的按金额排序。
-- 15、	查询书价最高的前5种的书名、作者、出版社和定价。
-- 16、	查询买过哪些出版社的书。
-- 17、	查询借阅用户总人数。
-- 18、	查询当前正借有书的用户总人数。
-- 19、	查询办证押金的总金额。
-- 20、	查询用户对书的平均借阅时间：按照用户分组，查询每个用户的平均借阅天数。
-- 21、	查询书的最高价格和最低价格。
-- 22、	查询出版社及从各个出版社购进的书各有多少种。
-- 23、	查询每种图书的书名和其库存量，并对结果按库存量排序。
-- 24、	对上题的查询结果只返回库存量在3本以上的书名和库存量。
-- 25、	查询2019年各种情况收费的总数大于50元的金额和收费原因。
-- 26、	查询当前借书用户的借阅证号、姓名、书号、借书日期。
-- 27、	查询当前借书过期还没归还的用户的借阅证号、姓名、书名、借书日期、过期天数，并按借阅证号排序。
-- 28、	内联接查询在流通总库的数据库类书的信息。
-- 29、	左外联接查询分类为4的用户的姓名、单位、及借阅情况。
-- 30、	使用子查询查询与借阅证号为“S06102”的用户在同一单位的所有用户的借阅证号和姓名。
-- 31、	使用子查询查询所有借书预约成功的用户的姓名和E_mail，以便通知他们。
-- 32、	使用子查询查询类别为“教师”的用户的借书情况。
-- 33、	计算相关子查询查询借阅数量大于3本的用户的借阅证号、姓名、单位。
-- 34、	查询所有曾经借过书号为“A04500049”这本书的所有用户的借阅证号和姓名。
-- 35、	查询所有借过书的用户借阅证号。
-- 36、	查询现在正借有书的用户但以前没有借过书的用户的借阅证号。
-- 37、	查询当前所有借书信息，并将查询结果导出到’d:\loan.txt’文件中，字段之间用逗号分隔。
-- 38、	新建一个表loan_statics，包括ISBN和loancount(借阅次数)两个字段，通过查询将每类书的ISBN号和历史借阅次数添加到这个表中。
-- 39、	在USER表中添加一个金额字段amount，并对每个用户的交费总额进行修改。
SELECT unitName, lname FROM users;
SELECT * FROM bookinfo;
SELECT * FROM users WHERE unitName LIKE "计算机学院";
SELECT * FROM books WHERE bstatus='3';
SELECT bookNo, loanNo FROM loan WHERE DATEDIFF(now(),borrowDate)>60;
SELECT bname, author, price FROM bookinfo WHERE press = "清华大学出版社";
SELECT * FROM books WHERE location = '流通总库' && bstatus = '0';
SELECT * FROM bookinfo WHERE price BETWEEN 30 AND 50;
SELECT * FROM loanhist WHERE year(borrowDate)='2019';
SELECT bname,author,press,price FROM bookinfo WHERE author IN('兰苓','孙海涛','刘明');
SELECT bname,author,press,price FROM bookinfo WHERE bname LIKE "%数据库%" order by bname ASC;
SELECT bname,author,press,price FROM bookinfo WHERE bname LIKE "%数据库%";
SELECT * FROM money order by billdate DESC, amount;
SELECT bname,author,press,price FROM bookinfo ORDER BY price DESC LIMIT 5;
select press,COUNT(*) FROM bookinfo GROUP BY press;
select COUNT(*) FROM users;
select COUNT(*) FROM loan;
select sum(amount) FROM money WHERE reason="办证押金";
SELECT AVG(DATEDIFF(borrowDate,returnDate)) FROM loanhist GROUP BY loanNo;
-- 最低价格
SELECT MAX(price), MIN(price) FROM bookinfo; 
SELECT press,COUNT(*) FROM bookinfo GROUP BY press;
-- !!
SELECT a.bname, b.ISBN,COUNT(*) FROM bookinfo a, books b WHERE a.ISBN = b.ISBN GROUP BY ISBN HAVING COUNT(*) > 2 ORDER BY COUNT(*), ISBN desc ;
SELECT * FROM money;
SELECT amount, reason FROM money WHERE amount>50 && year(billdate)='2019' ;
SELECT a.bookNo, a.loanNo, a.borrowDate, b.lname FROM loan a, users b WHERE a.loanNo=b.loanNo;
SELECT c.bname, a.loanNo, a.borrowDate, b.lname,d.ISBN FROM loan a, users b,bookinfo c, books d,class_user e WHERE e.classNo=b.classNo && a.loanNo=b.loanNo &&  a.bookNo=d.bookNo && d.ISBN = c.ISBN && DATEDIFF(now(),a.borrowDate) > e.term ORDER BY a.loanNo;
SELECT a.* FROM bookinfo a INNER JOIN books b ON a.ISBN=b.ISBN && b.location="流通总库" && a.bname LIKE "%数据库%";
-- ??
SELECT a.lname, a.unitName, a.registerDate,a.classNo FROM users a LEFT JOIN loan b ON a.loanNo = b.loanNo && a.classNo=4;
SELECT a.loanNo, a.lname FROM users a, loan b WHERE a.loanNo=b.loanNo && b.bookNo='A04500049';
SELECT a.loanNo FROM users a, loan b WHERE a.loanNo=b.loanNo;
SELECT loanNo, lname FROM users WHERE unitName IN (SELECT unitName FROM users WHERE loanNo="S06102");
SELECT lname, email FROM users WHERE loanNo IN (SELECT loanNo FROM reservation WHERE rstatus='t');
SELECT * FROM loan WHERE loanNo IN (SELECT loanNo FROM users WHERE classNo IN (SELECT classNo FROM class_user WHERE cname="教师"));
-- 不能丢掉group by!!
SELECT a.loanNo, a.unitName,a.lname FROM users a INNER JOIN (SELECT loanNo, COUNT(*) FROM loan GROUP BY loanNo HAVING COUNT(*) > 2)b ON a.loanNo=b.loanNo;


