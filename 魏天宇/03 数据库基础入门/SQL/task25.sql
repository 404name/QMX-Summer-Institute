select amount,reason 
from money 
where year(billdate) = 2019 and amount > 50;