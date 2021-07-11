select books.*,bookinfo.* 
from books join bookinfo on 
books.ISBN = bookinfo.ISBN
where books.location = '流通总库' and
bookinfo.bname like '%数据库%';
