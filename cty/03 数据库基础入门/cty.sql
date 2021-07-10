-- q1
SELECT `lname`, `unitName` FROM `users`

-- q2
SELECT * 
FROM `books` s
LEFT JOIN `bookinfo` i
ON i.`ISBN` = s.`ISBN` 

-- q3
SELECT * 
FROM `users` u
LEFT JOIN `class_user` c
ON u.`classNo` = c.`classNo` 
WHERE unitName = '计算机学院'

-- q4
SELECT * 
FROM `books` s
LEFT JOIN `bookinfo` i
ON i.`ISBN` = s.`ISBN` 
WHERE `bstatus` = 1

-- q5
SELECT l.`bookNo`, l.`loanNo` 
FROM `loan` l
LEFT JOIN `loanhist` lh
ON l.`bookNo` = lh.`bookNo`
WHERE TIMESTAMPDIFF(DAY,l.`borrowDate`,NOW()) > 60 AND lh.`bookNo` IS NULL

-- q6
SELECT `bname`, `author`, `price`
FROM `bookinfo`
WHERE `press` = '清华大学出版社'

-- q7
SELECT * 
FROM `books` s
LEFT JOIN `bookinfo` i
ON i.`ISBN` = s.`ISBN` 
WHERE (`location` = '流通总库' OR `location` = '计算机学院资料室') AND `bstatus` = 0

-- q8
SELECT * 
FROM `books` s
LEFT JOIN `bookinfo` i
ON i.`ISBN` = s.`ISBN` 
WHERE `price` >= 30 AND `price` <= 50

-- q9
SELECT * FROM `loanhist` WHERE YEAR(`borrowDate`) = 2019

-- q10
SELECT `bname`, `author`, `press`, `price`
FROM `bookinfo`
WHERE `author` IN ('兰苓', '孙海涛', '刘明')

-- q11
SELECT `bname`, `author`, `press`, `price`
FROM `bookinfo`
WHERE `bname` LIKE '%数据库%'

-- q12
SELECT `bname`, `author`, `press`, `price` * 1.5 AS price
FROM `bookinfo`
WHERE `bname` LIKE '%数据库%'

-- q13
SELECT `bname`, `author`, `press`, `price` * 1.5 AS price
FROM `bookinfo`
WHERE `bname` LIKE '%数据库%'
ORDER BY `bname` DESC

-- q14
SELECT * 
FROM `money`
ORDER BY `billdate` DESC, `amount` DESC

-- q15
SELECT `bname`, `author`, `press`, `price`
FROM `bookinfo`
ORDER BY `price` DESC
LIMIT 0, 5

-- q16
SELECT DISTINCT `press` FROM `bookinfo`

-- q17
SELECT COUNT(DISTINCT loanNo) FROM `loanhist`

-- q18
SELECT COUNT(DISTINCT loanNo) FROM `loan`

-- p19
SELECT SUM(`amount`) 
FROM `money`
WHERE `reason` = '办证押金'

-- p20
SELECT AVG(TIMESTAMPDIFF(DAY,lh.`borrowDate`,lh.`returnDate`)) AS 平均借阅天数
FROM `loanhist` lh
INNER JOIN `users` u
ON lh.`loanNo` = u.`loanNo`
GROUP BY `classNo`

-- p21
SELECT MAX(`price`), MIN(`price`) FROM `bookinfo`

-- p22 
SELECT `press`, COUNT(1)
FROM `bookinfo`
GROUP BY `press`

-- p23
SELECT `bname`, COUNT(1) 库存
FROM `books` b
LEFT JOIN `bookinfo` bi
ON b.`ISBN` = bi.`ISBN`
GROUP BY b.`ISBN`
ORDER BY 库存 DESC

-- p24
SELECT `bname`, `ctr_no`
FROM `books` b
LEFT JOIN `bookinfo` bi
ON b.`ISBN` = bi.`ISBN`
HAVING `ctr_no` >= 3
ORDER BY `ctr_no` DESC
`money`

-- q25
SELECT `amount`, `reason`
FROM `money`
WHERE YEAR(`billdate`) = 2019 AND `amount` > 50

-- q26
SELECT l.`loanNo`, `bookNo`, `borrowDate`, `lname`
FROM `loan` l
LEFT JOIN `users` u
ON l.`loanNo` = u.`loanNo`

-- q27
SELECT u.`loanNo`, `lname`, bi.`bname`, `borrowDate`, TIMESTAMPDIFF(DAY,`borrowDate`,NOW()) - `term`
FROM `users` u
INNER JOIN `loan` l
ON u.`loanNo` = l.`loanNo`
INNER JOIN `class_user` c
ON u.`classNo` = c.`classNo`
INNER JOIN `books` b
ON b.`bookNo` = l.`bookNo`
INNER JOIN `bookinfo` bi
ON bi.`ISBN` = b.`ISBN`
WHERE TIMESTAMPDIFF(DAY,`borrowDate`,NOW()) - `term` > 0

-- q28
SELECT * 
FROM `books` s
INNER JOIN `bookinfo` i
ON i.`ISBN` = s.`ISBN` 
WHERE `location` = '流通总库' AND `bname` LIKE '%数据库%'

-- q29
SELECT `lname`, `unitName`, u.`loanNo`, `bookNo`, `borrowDate`, `returnDate`
FROM `users` u
LEFT JOIN `loanhist` l
ON u.`loanNo` = l.`loanNo`

-- q30
SELECT `loanNo`, `lname`
FROM `users`
WHERE `unitName` = (
SELECT `unitName` FROM `users`
WHERE `loanNo` = 'S06102'
)

-- q31
SELECT `lname`, `email`
FROM `users`
WHERE `loanNo` = ANY(
SELECT `loanNo`
FROM `reservation`
WHERE `rstatus` = 't'
)

-- q32
SELECT `lname`, `unitName`, u.`loanNo`, `bookNo`, `borrowDate`, `returnDate`
FROM `users` u
LEFT JOIN `loanhist` l
ON u.`loanNo` = l.`loanNo`
WHERE `classNo` = (
SELECT `classNo`
FROM `class_user`
WHERE `cname` = '教师'
)

-- q33
SELECT `loanNo`, `lname`, `unitName`
FROM `users`
WHERE `loanNo` = (
SELECT `loanNo`
FROM `loan`
GROUP BY `loanNo`
HAVING COUNT(`bookNo`) > 3
)

-- q34
SELECT u.`loanNo`, `lname`
FROM `users` u
RIGHT JOIN `loan` l
ON u.`loanNo` = l.`loanNo`
WHERE l.`bookNo` = 'A04500049'

-- q35
SELECT DISTINCT `loanNo`
FROM `loanhist`

-- q36
SELECT DISTINCT `loanNo`
FROM `loanhist`
WHERE `loanNo` <> (
SELECT `loanNo`
FROM `loanhist`
WHERE `returnDate` IS NOT NULL
)

-- q37
SELECT * FROM `loan` INTO OUTFILE 'd:\loan1.txt' FIELDS TERMINATED BY ','

-- q38
TRUNCATE `loan_statics`
INSERT INTO `loan_statics` 
SELECT DISTINCT `ISBN`, COUNT(1) AS 借阅次数
FROM `loanhist` l
INNER JOIN `books` b
ON l.`bookNo` = b.`bookNo`
GROUP BY `ISBN`

-- q39
ALTER TABLE `users` ADD `amount` INT DEFAULT 0 COMMENT '金额'
UPDATE `users` SET `amount` = (
SELECT SUM(`amount`)
FROM `money`
WHERE `loanNo` = 'S02152'
) 
WHERE `loanNo` = 'S02152'

UPDATE `users` SET `amount` = (
SELECT SUM(`amount`)
FROM `money`
WHERE `loanNo` = 'S02151'
) 
WHERE `loanNo` = 'S02151'

UPDATE `users` SET `amount` = (
SELECT SUM(`amount`)
FROM `money`
WHERE `loanNo` = 'S02153'
) 
WHERE `loanNo` = 'S02153'