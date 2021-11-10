#编写 SQL 查询以使用单个更新语句交换所有 'f' 和 'm' 值(即,将所有 'f' 值更改为 'm',反之亦然)并且没有中间临时表.
#注意一定要写一个单独的update语句,不要针对这个问题写任何select语句.

update Salary
set sex = if(sex='m','f','m');