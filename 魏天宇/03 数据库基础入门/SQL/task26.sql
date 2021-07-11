select a.loanNo,b.lname,a.bookNo,a.borrowDate
from loan a,users b 
where a.loanNo = b.loanNo;