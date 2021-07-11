select users.loanNo as loanno,users.lname,bookinfo.bname,loan.borrowDate,datediff(curdate(),borrowdate) - term as '过期天数'
from loan,users,bookinfo,class_user,books
where loan.loanNo = users.loanNo and 
loan.bookNo = books.bookNo and
books.ISBN=bookinfo.ISBN and
users.classNo = class_user.classNo and 
datediff(curdate(),borrowDate) > term
order by loan.loanNo;