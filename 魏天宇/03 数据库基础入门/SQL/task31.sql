select lname,email from users 
where loanNo = any(select loanNo from reservation where rstatus = 't');