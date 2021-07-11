select distinct loanNo 
from loan 
where loanNo not in(select loanNo from loanhist);