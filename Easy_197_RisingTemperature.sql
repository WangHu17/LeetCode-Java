#查询Weather表中比昨天温度高的id
#Runtime: 408 ms, faster than 65.14% of MySQL online submissions for Rising Temperature.
#Memory Usage: 0B, less than 100.00% of MySQL online submissions for Rising Temperature.

select Weather.id as id
from Weather
join Weather w
on datediff(Weather.recordDate, w.recordDate) = 1
    and Weather.Temperature > w.Temperature;