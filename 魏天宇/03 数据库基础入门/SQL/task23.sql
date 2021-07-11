select a.ISBN,b.bname,count(*) 
from Books a,BookInfo b
where a.ISBN=b.ISBN
group by ISBN
order by count(*);