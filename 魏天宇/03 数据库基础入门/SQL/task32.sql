select * from users 
where classNo = (select classNo 
from class_user 
where cname = '教师');