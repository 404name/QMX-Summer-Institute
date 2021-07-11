select loanNo,lname,unitName 
from userswhere loanNo = (select loanNo 
from loan
group by loanNo
having count(bookNo) > 3);
