select a.ISBN,b.bname,count(*) 
from Books a,BookInfo b
where a.ISBN=b.ISBN 
group by ISBN
having count(*) > 3
order by count(*);