select loanNo,lname
from users
where loanNo = any(
select loanNo 
from loan
where bookNo = 'A04500049');