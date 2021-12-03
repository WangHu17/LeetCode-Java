#编写
SQL 查询以查找至少连续出现 3 次的所有数字. 以任意顺序返回结果表.
Input:
Logs table:
+----+-----+
| id | num |
+----+-----+
| 1  | 1   |
| 2  | 1   |
| 3  | 1   |
| 4  | 2   |
| 5  | 1   |
| 6  | 2   |
| 7  | 2   |
+----+-----+
Output:
+-----------------+
| ConsecutiveNums |
+-----------------+
| 1               |
+-----------------+

# 这是在id连续的情况下
select distinct num as ConsecutiveNums
from Logs l1,
     Logs l2,
     Logs l3
where l1.id = l2.id - 1
  and l2.id = l3.id - 1
  and l1.num = l2.num
  and l2.num = l3.num;

# 如果id不连续,需要利用ROW_NUMBER()
With newLogs as (
    select *, ROW_NUMBER() over(order by id) as newid from Logs
)
select distinct l1.num as ConsecutiveNums
from newLogs l1,
     newLogs l2,
     newLogs l3
where l1.id = l2.id - 1
  and l2.id = l3.id - 1
  and l1.num = l2.num
  and l2.num = l3.num;