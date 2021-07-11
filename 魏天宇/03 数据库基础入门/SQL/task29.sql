select lname,unitName,loan.*
from users left join loan
on users.loanNo = loan.loanNo;