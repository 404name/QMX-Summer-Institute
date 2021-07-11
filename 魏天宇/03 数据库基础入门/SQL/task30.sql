select unitName,lname from users
where unitName = (select unitName from users where loanNo = 'S06102');