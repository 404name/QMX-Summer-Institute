/*
 Navicat Premium Data Transfer

 Source Server         : test
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : work

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 11/07/2021 19:11:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bookinfo
-- ----------------------------
DROP TABLE IF EXISTS `bookinfo`;
CREATE TABLE `bookinfo`  (
  `ISBN` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bname` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `press` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` float NOT NULL,
  `language` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '中文',
  `pages` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`ISBN`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bookinfo
-- ----------------------------
INSERT INTO `bookinfo` VALUES ('7-04-004120-0', '机械制图', '周鹏翔', '高等教育出版社', 6.15, '中文', 301);
INSERT INTO `bookinfo` VALUES ('7-04-005548-1', '数学方法与解题研究', '戴再平', '高等教育出版社', 6.4, '中文', 203);
INSERT INTO `bookinfo` VALUES ('7-04-006973-3', '高等数学', '陈庆华', '高等教育出版社', 23, '中文', 446);
INSERT INTO `bookinfo` VALUES ('7-04-008815-0', '语言学概论', '李宇明', '高等教育出版社', 10.7, '中文', 318);
INSERT INTO `bookinfo` VALUES ('7-111-01342-5', '数字电子技术', '刘全盛', '机械工业出版社', 22, '中文', 211);
INSERT INTO `bookinfo` VALUES ('7-111-06372-4', 'CAD/CAM原理与应用', '蔡颖', '机械工业出版社', 25, '中文', 254);
INSERT INTO `bookinfo` VALUES ('7-111-06425-9', '人力资源管理', 'Ivancevich,J.M.', '机械工业出版社', 75, '中文', 730);
INSERT INTO `bookinfo` VALUES ('7-111-07699-0', '热处理实用技术', '李泉华', '机械工业出版社', 24, '中文', 219);
INSERT INTO `bookinfo` VALUES ('7-111-08571-X', '数控加工编程实用技术', '许祥泰,刘艳芳', '机械工业出版社', 25, '中文', 215);
INSERT INTO `bookinfo` VALUES ('7-111-09944-3', 'PowerBuilder数据库开发技术', '陈桂友', '机械工业出版社', 29, '中文', 327);
INSERT INTO `bookinfo` VALUES ('7-113-04885-4', 'Access2002学习指导直导：数据库实例导航', '桂思强', '中国铁道出版社', 39, '中文', 415);
INSERT INTO `bookinfo` VALUES ('7-113-04966-4', 'C++面向对象程序设计', '郑家瑜', '中国铁道出版社', 46, '中文', 575);
INSERT INTO `bookinfo` VALUES ('7-301-01013-3', '数学与文化', '邓东皋', '北京大学出版社', 16.5, '中文', 397);
INSERT INTO `bookinfo` VALUES ('7-301-03401-6', '行政法学', '罗豪才', '北京大学出版社', 29, '中文', 482);
INSERT INTO `bookinfo` VALUES ('7-301-04868-8', '微观经济学:第二版', '朱善利', '北京大学出版社', 32, '中文', 325);
INSERT INTO `bookinfo` VALUES ('7-301-05145-X', '管理信息系统', '张金城', '北京大学出版社', 25, '中文', 247);
INSERT INTO `bookinfo` VALUES ('7-301-06033-5', '邓小平理论与当代中国政治学', '宁骚,关海庭', '北京大学出版社', 23, '中文', 412);
INSERT INTO `bookinfo` VALUES ('7-302-02284-4', '城市经济学', '谢文惠', '清华大学出版社', 18, '中文', 465);
INSERT INTO `bookinfo` VALUES ('7-302-04147-4', 'MBA入学考试英语大纲词汇手册', '何清', '清华大学出版社', 12, '中文', 224);
INSERT INTO `bookinfo` VALUES ('7-302-04384-1', '3D MAX 4使用速成', '孙海涛', '清华大学出版社', 25, '中文', 286);
INSERT INTO `bookinfo` VALUES ('7-5609-0873-X', '数据库系统基础', '冯玉才', '华中理工大学出版社', 18, '中文', 486);
INSERT INTO `bookinfo` VALUES ('7-5638-0960-0', '市场营销学', '兰苓', '首都经济贸易大学出版社', 28, '中文', 329);
INSERT INTO `bookinfo` VALUES ('7-80076-825-2', '法律基础知识', '易俊', '中国人事出版社', 15.4, '中文', 422);
INSERT INTO `bookinfo` VALUES ('7-81049-693-X', '组织行为学', '龚敏', '上海财经大学出版社', 35, '中文', 371);

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `bookNo` char(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ISBN` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `location` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bstatus` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ctr_no` tinyint(4) NOT NULL,
  PRIMARY KEY (`bookNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('A04500010', '7-111-01342-5', '流通总库', '1', 15);
INSERT INTO `books` VALUES ('A04500011', '7-111-01342-5', '流通总库', '0', 7);
INSERT INTO `books` VALUES ('A04500012', '7-111-01342-5', '电气学院资料室', '0', 6);
INSERT INTO `books` VALUES ('A04500013', '7-111-01342-5', '教师阅览室', '2', 0);
INSERT INTO `books` VALUES ('A04500014', '7-111-06372-4', '机械学院资料室', '2', 0);
INSERT INTO `books` VALUES ('A04500015', '7-111-06372-4', '流通总库', '1', 15);
INSERT INTO `books` VALUES ('A04500016', '7-111-08571-X', '流通总库', '0', 15);
INSERT INTO `books` VALUES ('A04500017', '7-111-08571-X', '机械学院资料室', '0', 6);
INSERT INTO `books` VALUES ('A04500047', '7-111-06425-9', '流通总库', '0', 15);
INSERT INTO `books` VALUES ('A04500048', '7-111-06425-9', '流通总库', '3', 15);
INSERT INTO `books` VALUES ('A04500049', '7-111-06425-9', '流通总库', '1', 15);
INSERT INTO `books` VALUES ('A04500050', '7-111-06425-9', '管理学院资料室', '1', 6);
INSERT INTO `books` VALUES ('A04500051', '7-111-06425-9', '教师阅览室', '2', 0);

-- ----------------------------
-- Table structure for class_user
-- ----------------------------
DROP TABLE IF EXISTS `class_user`;
CREATE TABLE `class_user`  (
  `classNo` tinyint(4) NOT NULL,
  `cname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `term` tinyint(4) NOT NULL DEFAULT 30,
  `ceilingNum` tinyint(4) NOT NULL,
  PRIMARY KEY (`classNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class_user
-- ----------------------------
INSERT INTO `class_user` VALUES (2, '研究生', 60, 6);
INSERT INTO `class_user` VALUES (4, '教师', 120, 8);
INSERT INTO `class_user` VALUES (8, '社会人员', 30, 3);

-- ----------------------------
-- Table structure for loan
-- ----------------------------
DROP TABLE IF EXISTS `loan`;
CREATE TABLE `loan`  (
  `bookNo` char(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `loanNo` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `borrowDate` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`bookNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of loan
-- ----------------------------
INSERT INTO `loan` VALUES ('A04500010', 'X10463', '2001-11-01 00:00:00');
INSERT INTO `loan` VALUES ('A04500013', 'X15602', '2005-04-01 00:00:00');
INSERT INTO `loan` VALUES ('A04500014', 'X15602', '2006-04-01 00:00:00');
INSERT INTO `loan` VALUES ('A04500015', 'X15602', '2008-04-01 00:00:00');
INSERT INTO `loan` VALUES ('A04500049', 'X15602', '2007-04-01 00:00:00');

-- ----------------------------
-- Table structure for loan_statics
-- ----------------------------
DROP TABLE IF EXISTS `loan_statics`;
CREATE TABLE `loan_statics`  (
  `ISBN` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `loancount` int(10) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of loan_statics
-- ----------------------------
INSERT INTO `loan_statics` VALUES ('7-111-06372-4', 1);
INSERT INTO `loan_statics` VALUES ('7-111-06425-9', 1);
INSERT INTO `loan_statics` VALUES ('7-111-06372-4', 1);
INSERT INTO `loan_statics` VALUES ('7-111-06425-9', 1);
INSERT INTO `loan_statics` VALUES ('7-111-06372-4', 1);
INSERT INTO `loan_statics` VALUES ('7-111-06425-9', 1);
INSERT INTO `loan_statics` VALUES ('7-111-06372-4', 1);
INSERT INTO `loan_statics` VALUES ('7-111-06425-9', 1);

-- ----------------------------
-- Table structure for loanhist
-- ----------------------------
DROP TABLE IF EXISTS `loanhist`;
CREATE TABLE `loanhist`  (
  `loanNo` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookNo` char(9) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `borrowDate` datetime(0) NOT NULL,
  `returnDate` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`loanNo`, `bookNo`, `borrowDate`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of loanhist
-- ----------------------------
INSERT INTO `loanhist` VALUES ('G01000', 'A04500017', '2019-06-01 00:00:00', '2019-06-24 00:00:00');
INSERT INTO `loanhist` VALUES ('J00010', 'A04500011', '2018-05-01 00:00:00', '2018-05-28 00:00:00');

-- ----------------------------
-- Table structure for money
-- ----------------------------
DROP TABLE IF EXISTS `money`;
CREATE TABLE `money`  (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `loanNo` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bookNo` char(9) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `amount` float NOT NULL,
  `reason` enum('过期罚款','损坏赔偿','丢失赔偿','办证费','办证押金') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `billdate` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of money
-- ----------------------------
INSERT INTO `money` VALUES (1, 'S02152', NULL, 10, '办证费', '2019-05-05 00:00:00');
INSERT INTO `money` VALUES (2, 'S02152', NULL, 100, '办证押金', '2019-05-05 00:00:00');
INSERT INTO `money` VALUES (3, 'S02151', NULL, 100, '办证押金', '2019-06-01 00:00:00');
INSERT INTO `money` VALUES (4, 'S02153', NULL, 100, '办证押金', '2018-06-02 00:00:00');

-- ----------------------------
-- Table structure for reservation
-- ----------------------------
DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation`  (
  `ISBN` char(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `loanNo` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `reservation` datetime(0) NOT NULL,
  `rstatus` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ISBN`, `loanNo`, `reservation`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reservation
-- ----------------------------
INSERT INTO `reservation` VALUES ('7-111-01342-5', 'J00010', '2019-12-28 00:00:00', 'f');
INSERT INTO `reservation` VALUES ('7-5609-0873-X', 'S06102', '2020-03-04 00:00:00', 't');
INSERT INTO `reservation` VALUES ('7-80076-825-2', 'T02001', '2019-12-01 00:00:00', 't');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `loanNo` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `lname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pwd` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `unitName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `registerDate` datetime(0) NULL DEFAULT NULL,
  `classNo` tinyint(4) NOT NULL,
  `email` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `amount` int(10) NOT NULL,
  PRIMARY KEY (`loanNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('G01000', '李红', '123456', '计算机学院', '2018-09-01 00:00:00', 4, 'LH@SOHU.COM', 0);
INSERT INTO `users` VALUES ('J00010', '张卫红', '123456', '管理学院', '2018-09-02 00:00:00', 4, 'ZWH@YAHOO.COM.CN', 0);
INSERT INTO `users` VALUES ('J00011', '刘小燕', '123456', '管理学院', '2018-09-17 00:00:00', 1, 'LXY@uhe.edu.cn', 0);
INSERT INTO `users` VALUES ('S02151', '李卫国', '123456', '东方大酒店', '2018-09-08 00:00:00', 8, '', 100);
INSERT INTO `users` VALUES ('S02152', '张小勇', '123456', '三洋公司', '2018-09-15 00:00:00', 8, '', 110);
INSERT INTO `users` VALUES ('S02153', '陈志军', '123456', '国际贸易公司', '2018-09-16 00:00:00', 8, '', 100);
INSERT INTO `users` VALUES ('S06102', '刘明', '123456', '机械学院', '2018-09-03 00:00:00', 4, 'LIU@263.COM', 0);
INSERT INTO `users` VALUES ('S06103', '钱红', '123456', '机械学院', '2018-09-04 00:00:00', 4, 'QH@363.com', 0);
INSERT INTO `users` VALUES ('T02001', '陈军军', '123456', '土木学院', '2018-09-11 00:00:00', 4, 'CJJ@uhe.edu.cn', 0);
INSERT INTO `users` VALUES ('X10462', '张三', '123456', '20011321', '2018-09-07 00:00:00', 1, '', 0);
INSERT INTO `users` VALUES ('X10463', '李东', '123456', '20031322', '2018-09-10 00:00:00', 1, '', 0);
INSERT INTO `users` VALUES ('X12089', '张军', '123456', '20001015', '2018-09-06 00:00:00', 1, '', 0);
INSERT INTO `users` VALUES ('X15601', '陈俊', '123456', '20021821', '2018-09-09 00:00:00', 1, '', 0);
INSERT INTO `users` VALUES ('X15602', '刘洋', '123456', '20031821', '2018-09-05 00:00:00', 1, '', 0);
INSERT INTO `users` VALUES ('Y00001', '高山', '123456', '研究生院', '2018-09-12 00:00:00', 2, '', 0);
INSERT INTO `users` VALUES ('Y00002', '欧阳平', '123456', '研究生院', '2018-09-13 00:00:00', 2, '', 0);
INSERT INTO `users` VALUES ('Y00003', '刘倩', '123456', '研究生院', '2018-09-14 00:00:00', 2, '', 0);

SET FOREIGN_KEY_CHECKS = 1;
