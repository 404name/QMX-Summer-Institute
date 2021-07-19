/*
 Navicat Premium Data Transfer

 Source Server         : bendi
 Source Server Type    : MySQL
 Source Server Version : 80016
 Source Host           : localhost:3306
 Source Schema         : library_work

 Target Server Type    : MySQL
 Target Server Version : 80016
 File Encoding         : 65001

 Date: 14/07/2020 10:20:09
*/ 
-- 1 从USER表中查询所有用户的姓名和单位。
SELECT
	lname,
	unitName 
FROM
	users;
	
-- 2 查询所有图书的信息。
SELECT
	* 
FROM
	bookinfo;
	
-- 3 查询单位为“计算机学院”的用户的全部信息。
SELECT
	* 
FROM
	users 
WHERE
	unitName = '计算机学院';
	
-- 4 查询已经预约但还没有借出的书的信息。
SELECT
	* 
FROM
	reservation 
WHERE
	rstatus = 't';
	
-- 5 查询借书超过60天且还没有归还的借阅证号、书号。
SELECT
	bookNo,
	loanNo 
FROM
	loan;
	
-- 6 查询“清华大学出版社”出版的所有中文书的书名、作者、价格。
SELECT
	bname,
	author,
	pages 
FROM
	bookinfo 
WHERE
	press = '清华大学出版社' 
	AND `language` = '中文';
	
-- 7 查询在流通总库或者是属于计算机学院资料室的尚未借出的书。
SELECT
	* 
FROM
	books 
WHERE
	( location = '流通总库' OR '计算机学院资料室' ) 
	AND bstatus = 0;
	
-- 8 查询价格在30元到50元之间的书。
SELECT
	* 
FROM
	bookinfo 
WHERE
	price > 30 
	AND price < 50;
	
-- 9 查询2019年的借阅历史情况。
SELECT
	* 
FROM
	loanhist 
WHERE
	borrowDate LIKE '2019%';
	
-- 10 查询作者为兰苓、孙海涛、刘明编写的书的书名、作者、出版社和价格。
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
	
-- 11 查询书名包含“数据库”的所有书名、作者、出版社和价格。
SELECT
	bname,
	author,
	press,
	price
FROM
	bookinfo
WHERE
	bname
LIKE
	'%数据库%';
	
-- 12 查询书名包含“数据库”的所有书名、作者、出版社及价格*1.5 ,并将最后一列重命名为price
SELECT
	bookinfo.bname,
	bookinfo.author,
	bookinfo.press,
	bookinfo.price*1.5 AS price
FROM
	bookinfo
WHERE
	bname
LIKE
	'%数据库%';
	
-- 13 查询书名包含“数据库”的所有书名、作者、出版社及价格*1.5 ,并将最后一列重命名为price 结果按书名排序。
SELECT
	bookinfo.bname,
	bookinfo.author,
	bookinfo.press,
	bookinfo.price*1.5 AS price
FROM
	bookinfo
WHERE
	bname
LIKE
	'%数据库%'
ORDER BY
	bname;
	
-- 14 查询收费情况，结果先按日期降序排序，同一天的按金额排序。
SELECT
	* 
FROM
	money 
ORDER BY
	money.billdate DESC,
	money.amount;

--  15 查询书价最高的前5种的书名、作者、出版社和定价。
SELECT
	bookinfo.bname,
	bookinfo.author,
	bookinfo.press,
	bookinfo.price
FROM
	bookinfo
ORDER BY
  price DESC
LIMIT 5;
	
-- 16 查询买过哪些出版社的书。
SELECT
	*
FROM
	books
INNER JOIN
	bookinfo 
WHERE
	books.ISBN = bookinfo.ISBN;
	

-- 17 查询借阅用户总人数。
SELECT
	COUNT(*)
FROM
	users;
	
-- 18 查询当前正借有书的用户总人数。

SELECT
	COUNT(*)
FROM
	loan;
	
-- 19 查询办证押金的总金额。
SELECT
	SUM(money.amount)
FROM
	money
WHERE
	reason = '办证押金';
	
-- 20 查询用户对书的平均借阅时间：按照用户分组，查询每个用户的平均借阅天数。
SELECT
	AVG((
		DATEDIFF( loanhist.returnDate, loanhist.borrowDate ))) 
FROM
	loanhist 
GROUP BY
	loanhist.loanNo;
	
-- 21 查询书的最高价格和最低价格。
SELECT
	MAX(price),
	MIN(price)
FROM
	bookinfo;
	
-- 22 查询出版社及从各个出版社购进的书各有多少种。

SELECT
	press AS 出版社,
	count(*) AS 种类 
FROM
	bookinfo 
GROUP BY
	press;

-- 23 查询每种图书的书名和其库存量，并对结果按库存量排序。
SELECT
	bname,
	COUNT(*) 
FROM
	books,
	bookinfo 
WHERE
	books.ISBN = bookinfo.ISBN 
GROUP BY
	books.ISBN
ORDER BY
	COUNT(*);
	
	
-- 24 对上题的查询结果只返回库存量在3本以上的书名和库存量。
SELECT
	bname,
	COUNT(*) 
FROM
	books,
	bookinfo 
WHERE
	books.ISBN = bookinfo.ISBN 
GROUP BY
	books.ISBN
ORDER BY
	COUNT(*) DESC
LIMIT
	3;

-- 25 查询2019年各种情况收费的总数大于50元的金额和收费原因。
SELECT
	amount,
	reason
FROM
	money
WHERE
	YEAR(billdate) = 2019 AND
	amount > 50;
	
-- 26 查询当前借书用户的借阅证号、姓名、书号、借书日期。
SELECT
	users.loanNo,
	users.lname,
	loan.bookNo,
	loan.borrowDate
FROM
	users,
	loan
WHERE
	users.loanNo = loan.loanNo;

-- 27 查询当前借书过期还没归还的用户的借阅证号、姓名、书名、借书日期、过期天数，并按借阅证号排序。
SELECT
	users.lname,
	users.lname,
	bookinfo.bname,
	loan.borrowDate,
	DATEDIFF(CURDATE(),loan.borrowDate) AS 过期时间
FROM
	users,
	bookinfo,
	loan,
	books
WHERE
	users.loanNo = loan.loanNo 
AND
	loan.bookNo = books.bookNo
AND
	books.ISBN = bookinfo.ISBN
ORDER BY
	users.loanNo;

-- 28 内联接查询在流通总库的数据库类书的信息。
SELECT
	bookinfo.ISBN,
	bookinfo.bname,
	bookinfo.author,
	bookinfo.press 
FROM
	books
	INNER JOIN bookinfo ON books.ISBN = bookinfo.ISBN 
WHERE
	books.location = '流通总库' 
	AND bookinfo.bname = '%数据库%';


-- 29 左外联接查询分类为4的用户的姓名、单位、及借阅情况
SELECT
	users.lname,
	users.unitName,
	loan.bookNo,
	loan.loanNo,
	loan.borrowDate 
FROM
	users
	LEFT JOIN loan ON users.loanNo = loan.loanNo 
WHERE
	users.classNo = 4;
	
-- 30 使用子查询查询与借阅证号为“S06102”的用户在同一单位的所有用户的借阅证号和姓名。
SELECT
	loanNo,
	lname 
FROM
	users 
WHERE
	unitName = ( SELECT unitName FROM users WHERE loanNo = 'S06102' );
	
-- 31 使用子查询查询所有借书预约成功的用户的姓名和E_mail，以便通知他们。
SELECT
	lname,
	email 
FROM
	users 
WHERE
	loanNo IN ( SELECT loanNo FROM reservation WHERE rstatus = 't' );
	
-- 32 使用子查询查询类别为“教师”的用户的借书情况。

-- 33 计算相关子查询查询借阅数量大于3本的用户的借阅证号、姓名、单位。

-- 34 查询所有曾经借过书号为“A04500049”这本书的所有用户的借阅证号和姓名。
SELECT
	loanNo,
	lname 
FROM
	users 
WHERE
	loanNo IN ( SELECT loanNo FROM loanhist WHERE bookNo = 'A04500049' );

-- 35 查询所有借过书的用户借阅证号。
SELECT
	loanNo 
FROM
	loan 
UNION
SELECT
	loanNo 
FROM
	loanhist;
	
-- 36 查询现在正借有书的用户但以前没有借过书的用户的借阅证号。
SELECT DISTINCT
	loanNo 
FROM
	loan 
WHERE
	loanNo NOT IN ( SELECT loanNo FROM loanhist );













SET NAMES utf8mb4;

SET FOREIGN_KEY_CHECKS = 0;-- ----------------------------
-- Table structure for bookinfo
-- ----------------------------
DROP TABLE
IF
	EXISTS `bookinfo`;
CREATE TABLE `bookinfo` (
	`ISBN` CHAR ( 13 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`bname` VARCHAR ( 60 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`author` VARCHAR ( 30 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`press` VARCHAR ( 40 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`price` FLOAT NOT NULL,
	`language` VARCHAR ( 20 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NULL DEFAULT '中文',
	`pages` INT ( 11 ) NULL DEFAULT NULL,
	PRIMARY KEY ( `ISBN` ) USING BTREE 
) ENGINE = INNODB CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Records of bookinfo
-- ----------------------------
INSERT INTO `bookinfo`
VALUES
	( '7-04-004120-0', '机械制图', '周鹏翔', '高等教育出版社', 6.15, '中文', 301 );
INSERT INTO `bookinfo`
VALUES
	( '7-04-005548-1', '数学方法与解题研究', '戴再平', '高等教育出版社', 6.4, '中文', 203 );
INSERT INTO `bookinfo`
VALUES
	( '7-04-006973-3', '高等数学', '陈庆华', '高等教育出版社', 23, '中文', 446 );
INSERT INTO `bookinfo`
VALUES
	( '7-04-008815-0', '语言学概论', '李宇明', '高等教育出版社', 10.7, '中文', 318 );
INSERT INTO `bookinfo`
VALUES
	( '7-111-01342-5', '数字电子技术', '刘全盛', '机械工业出版社', 22, '中文', 211 );
INSERT INTO `bookinfo`
VALUES
	( '7-111-06372-4', 'CAD/CAM原理与应用', '蔡颖', '机械工业出版社', 25, '中文', 254 );
INSERT INTO `bookinfo`
VALUES
	( '7-111-06425-9', '人力资源管理', 'Ivancevich,J.M.', '机械工业出版社', 75, '中文', 730 );
INSERT INTO `bookinfo`
VALUES
	( '7-111-07699-0', '热处理实用技术', '李泉华', '机械工业出版社', 24, '中文', 219 );
INSERT INTO `bookinfo`
VALUES
	( '7-111-08571-X', '数控加工编程实用技术', '许祥泰,刘艳芳', '机械工业出版社', 25, '中文', 215 );
INSERT INTO `bookinfo`
VALUES
	( '7-111-09944-3', 'PowerBuilder数据库开发技术', '陈桂友', '机械工业出版社', 29, '中文', 327 );
INSERT INTO `bookinfo`
VALUES
	( '7-113-04885-4', 'Access2002学习指导直导：数据库实例导航', '桂思强', '中国铁道出版社', 39, '中文', 415 );
INSERT INTO `bookinfo`
VALUES
	( '7-113-04966-4', 'C++面向对象程序设计', '郑家瑜', '中国铁道出版社', 46, '中文', 575 );
INSERT INTO `bookinfo`
VALUES
	( '7-301-01013-3', '数学与文化', '邓东皋', '北京大学出版社', 16.5, '中文', 397 );
INSERT INTO `bookinfo`
VALUES
	( '7-301-03401-6', '行政法学', '罗豪才', '北京大学出版社', 29, '中文', 482 );
INSERT INTO `bookinfo`
VALUES
	( '7-301-04868-8', '微观经济学:第二版', '朱善利', '北京大学出版社', 32, '中文', 325 );
INSERT INTO `bookinfo`
VALUES
	( '7-301-05145-X', '管理信息系统', '张金城', '北京大学出版社', 25, '中文', 247 );
INSERT INTO `bookinfo`
VALUES
	( '7-301-06033-5', '邓小平理论与当代中国政治学', '宁骚,关海庭', '北京大学出版社', 23, '中文', 412 );
INSERT INTO `bookinfo`
VALUES
	( '7-302-02284-4', '城市经济学', '谢文惠', '清华大学出版社', 18, '中文', 465 );
INSERT INTO `bookinfo`
VALUES
	( '7-302-04147-4', 'MBA入学考试英语大纲词汇手册', '何清', '清华大学出版社', 12, '中文', 224 );
INSERT INTO `bookinfo`
VALUES
	( '7-302-04384-1', '3D MAX 4使用速成', '孙海涛', '清华大学出版社', 25, '中文', 286 );
INSERT INTO `bookinfo`
VALUES
	( '7-5609-0873-X', '数据库系统基础', '冯玉才', '华中理工大学出版社', 18, '中文', 486 );
INSERT INTO `bookinfo`
VALUES
	( '7-5638-0960-0', '市场营销学', '兰苓', '首都经济贸易大学出版社', 28, '中文', 329 );
INSERT INTO `bookinfo`
VALUES
	( '7-80076-825-2', '法律基础知识', '易俊', '中国人事出版社', 15.4, '中文', 422 );
INSERT INTO `bookinfo`
VALUES
	( '7-81049-693-X', '组织行为学', '龚敏', '上海财经大学出版社', 35, '中文', 371 );-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE
IF
	EXISTS `books`;
CREATE TABLE `books` (
	`bookNo` CHAR ( 9 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`ISBN` CHAR ( 13 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`location` VARCHAR ( 40 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`bstatus` CHAR ( 1 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`ctr_no` TINYINT ( 4 ) NOT NULL,
	PRIMARY KEY ( `bookNo` ) USING BTREE 
) ENGINE = INNODB CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books`
VALUES
	( 'A04500010', '7-111-01342-5', '流通总库', '1', 15 );
INSERT INTO `books`
VALUES
	( 'A04500011', '7-111-01342-5', '流通总库', '0', 7 );
INSERT INTO `books`
VALUES
	( 'A04500012', '7-111-01342-5', '电气学院资料室', '0', 6 );
INSERT INTO `books`
VALUES
	( 'A04500013', '7-111-01342-5', '教师阅览室', '2', 0 );
INSERT INTO `books`
VALUES
	( 'A04500014', '7-111-06372-4', '机械学院资料室', '2', 0 );
INSERT INTO `books`
VALUES
	( 'A04500015', '7-111-06372-4', '流通总库', '1', 15 );
INSERT INTO `books`
VALUES
	( 'A04500016', '7-111-08571-X', '流通总库', '0', 15 );
INSERT INTO `books`
VALUES
	( 'A04500017', '7-111-08571-X', '机械学院资料室', '0', 6 );
INSERT INTO `books`
VALUES
	( 'A04500047', '7-111-06425-9', '流通总库', '0', 15 );
INSERT INTO `books`
VALUES
	( 'A04500048', '7-111-06425-9', '流通总库', '3', 15 );
INSERT INTO `books`
VALUES
	( 'A04500049', '7-111-06425-9', '流通总库', '1', 15 );
INSERT INTO `books`
VALUES
	( 'A04500050', '7-111-06425-9', '管理学院资料室', '1', 6 );
INSERT INTO `books`
VALUES
	( 'A04500051', '7-111-06425-9', '教师阅览室', '2', 0 );-- ----------------------------
-- Table structure for class_user
-- ----------------------------
DROP TABLE
IF
	EXISTS `class_user`;
CREATE TABLE `class_user` (
	`classNo` TINYINT ( 4 ) NOT NULL,
	`cname` VARCHAR ( 20 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`term` TINYINT ( 4 ) NOT NULL DEFAULT 30,
	`ceilingNum` TINYINT ( 4 ) NOT NULL,
	PRIMARY KEY ( `classNo` ) USING BTREE 
) ENGINE = INNODB CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Records of class_user
-- ----------------------------
INSERT INTO `class_user`
VALUES
	( 1, '学生', 30, 4 );
INSERT INTO `class_user`
VALUES
	( 2, '研究生', 60, 6 );
INSERT INTO `class_user`
VALUES
	( 4, '教师', 120, 8 );
INSERT INTO `class_user`
VALUES
	( 8, '社会人员', 30, 3 );-- ----------------------------
-- Table structure for loan
-- ----------------------------
DROP TABLE
IF
	EXISTS `loan`;
CREATE TABLE `loan` (
	`bookNo` CHAR ( 9 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`loanNo` VARCHAR ( 16 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`borrowDate` datetime ( 0 ) NULL,
	PRIMARY KEY ( `bookNo` ) USING BTREE 
) ENGINE = INNODB CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Records of loan
-- ----------------------------
INSERT INTO `loan`
VALUES
	( 'A04500010', 'X10463', '2001-11-01 00:00:00' );
INSERT INTO `loan`
VALUES
	( 'A04500013', 'X15602', '2005-04-01 00:00:00' );
INSERT INTO `loan`
VALUES
	( 'A04500014', 'X15602', '2006-04-01 00:00:00' );
INSERT INTO `loan`
VALUES
	( 'A04500015', 'X15602', '2008-04-01 00:00:00' );
INSERT INTO `loan`
VALUES
	( 'A04500049', 'X15602', '2007-04-01 00:00:00' );-- ----------------------------
-- Table structure for loan_statics
-- ----------------------------
DROP TABLE
IF
	EXISTS `loan_statics`;
CREATE TABLE `loan_statics` ( `ISBN` CHAR ( 13 ) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL, `loancount` INT ( 10 ) NOT NULL ) ENGINE = INNODB CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Records of loan_statics
-- ----------------------------
INSERT INTO `loan_statics`
VALUES
	( '7-111-06372-4', 1 );
INSERT INTO `loan_statics`
VALUES
	( '7-111-06425-9', 1 );
INSERT INTO `loan_statics`
VALUES
	( '7-111-06372-4', 1 );
INSERT INTO `loan_statics`
VALUES
	( '7-111-06425-9', 1 );
INSERT INTO `loan_statics`
VALUES
	( '7-111-06372-4', 1 );
INSERT INTO `loan_statics`
VALUES
	( '7-111-06425-9', 1 );
INSERT INTO `loan_statics`
VALUES
	( '7-111-06372-4', 1 );
INSERT INTO `loan_statics`
VALUES
	( '7-111-06425-9', 1 );-- ----------------------------
-- Table structure for loanhist
-- ----------------------------
DROP TABLE
IF
	EXISTS `loanhist`;
CREATE TABLE `loanhist` (
	`loanNo` VARCHAR ( 16 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`bookNo` CHAR ( 9 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`borrowDate` datetime ( 0 ) NOT NULL,
	`returnDate` datetime ( 0 ) NULL,
	PRIMARY KEY ( `loanNo`, `bookNo`, `borrowDate` ) USING BTREE 
) ENGINE = INNODB CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Table structure for money
-- ----------------------------
DROP TABLE
IF
	EXISTS `money`;
CREATE TABLE `money` (
	`ID` INT ( 11 ) NOT NULL AUTO_INCREMENT,
	`loanNo` VARCHAR ( 16 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`bookNo` CHAR ( 9 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
	`amount` FLOAT NOT NULL,
	`reason` enum ( '过期罚款', '损坏赔偿', '丢失赔偿', '办证费', '办证押金' ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
	`billdate` datetime ( 0 ) NULL,
	PRIMARY KEY ( `ID` ) USING BTREE 
) ENGINE = INNODB AUTO_INCREMENT = 4 CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Records of money
-- ----------------------------
INSERT INTO `money`
VALUES
	( 1, 'S02152', NULL, 10, '办证费', '2019-05-05 00:00:00' );
INSERT INTO `money`
VALUES
	( 2, 'S02152', NULL, 100, '办证押金', '2019-05-05 00:00:00' );
INSERT INTO `money`
VALUES
	( 3, 'S02151', NULL, 100, '办证押金', '2019-06-01 00:00:00' );
INSERT INTO `money`
VALUES
	( 4, 'S02153', NULL, 100, '办证押金', '2018-06-02 00:00:00' );-- ----------------------------
-- Table structure for reservation
-- ----------------------------
DROP TABLE
IF
	EXISTS `reservation`;
CREATE TABLE `reservation` (
	`ISBN` CHAR ( 13 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`loanNo` VARCHAR ( 16 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`reservation` datetime ( 0 ) NOT NULL,
	`rstatus` CHAR ( 1 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	PRIMARY KEY ( `ISBN`, `loanNo`, `reservation` ) USING BTREE 
) ENGINE = INNODB CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Records of reservation
-- ----------------------------
INSERT INTO `reservation`
VALUES
	( '7-111-01342-5', 'J00010', '2019-12-28 00:00:00', 'f' );
INSERT INTO `reservation`
VALUES
	( '7-5609-0873-X', 'S06102', '2020-03-04 00:00:00', 't' );
INSERT INTO `reservation`
VALUES
	( '7-80076-825-2', 'T02001', '2019-12-01 00:00:00', 't' );-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE
IF
	EXISTS `users`;
CREATE TABLE `users` (
	`loanNo` VARCHAR ( 16 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`lname` VARCHAR ( 30 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`pwd` VARCHAR ( 16 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`unitName` VARCHAR ( 50 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NOT NULL,
	`registerDate` datetime ( 0 ) NULL,
	`classNo` TINYINT ( 4 ) NOT NULL,
	`email` VARCHAR ( 40 ) CHARACTER 
	SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
	`amount` INT ( 10 ) NOT NULL,
	PRIMARY KEY ( `loanNo` ) USING BTREE 
) ENGINE = INNODB CHARACTER 
SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users`
VALUES
	( 'G01000', '李红', '123456', '计算机学院', '2018-09-01 00:00:00', 4, 'LH@SOHU.COM', 0 );
INSERT INTO `users`
VALUES
	( 'J00010', '张卫红', '123456', '管理学院', '2018-09-02 00:00:00', 4, 'ZWH@YAHOO.COM.CN', 0 );
INSERT INTO `users`
VALUES
	( 'J00011', '刘小燕', '123456', '管理学院', '2018-09-17 00:00:00', 1, 'LXY@uhe.edu.cn', 0 );
INSERT INTO `users`
VALUES
	( 'S02151', '李卫国', '123456', '东方大酒店', '2018-09-08 00:00:00', 8, '', 100 );
INSERT INTO `users`
VALUES
	( 'S02152', '张小勇', '123456', '三洋公司', '2018-09-15 00:00:00', 8, '', 110 );
INSERT INTO `users`
VALUES
	( 'S02153', '陈志军', '123456', '国际贸易公司', '2018-09-16 00:00:00', 8, '', 100 );
INSERT INTO `users`
VALUES
	( 'S06102', '刘明', '123456', '机械学院', '2018-09-03 00:00:00', 4, 'LIU@263.COM', 0 );
INSERT INTO `users`
VALUES
	( 'S06103', '钱红', '123456', '机械学院', '2018-09-04 00:00:00', 4, 'QH@363.com', 0 );
INSERT INTO `users`
VALUES
	( 'T02001', '陈军军', '123456', '土木学院', '2018-09-11 00:00:00', 4, 'CJJ@uhe.edu.cn', 0 );
INSERT INTO `users`
VALUES
	( 'X10462', '张三', '123456', '20011321', '2018-09-07 00:00:00', 1, '', 0 );
INSERT INTO `users`
VALUES
	( 'X10463', '李东', '123456', '20031322', '2018-09-10 00:00:00', 1, '', 0 );
INSERT INTO `users`
VALUES
	( 'X12089', '张军', '123456', '20001015', '2018-09-06 00:00:00', 1, '', 0 );
INSERT INTO `users`
VALUES
	( 'X15601', '陈俊', '123456', '20021821', '2018-09-09 00:00:00', 1, '', 0 );
INSERT INTO `users`
VALUES
	( 'X15602', '刘洋', '123456', '20031821', '2018-09-05 00:00:00', 1, '', 0 );
INSERT INTO `users`
VALUES
	( 'Y00001', '高山', '123456', '研究生院', '2018-09-12 00:00:00', 2, '', 0 );
INSERT INTO `users`
VALUES
	( 'Y00002', '欧阳平', '123456', '研究生院', '2018-09-13 00:00:00', 2, '', 0 );
INSERT INTO `users`
VALUES
	( 'Y00003', '刘倩', '123456', '研究生院', '2018-09-14 00:00:00', 2, '', 0 );