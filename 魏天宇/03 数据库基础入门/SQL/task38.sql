 create table loan_statics(
 ISBN char(13),
 loancount int
);

 insert into loan_statics(ISBN,loancount)
 select ISBN,count(*)
 from books b inner join (select bookNo
 from loanhist) c
 where b.bookNo=c.bookNo
 group by ISBN;
