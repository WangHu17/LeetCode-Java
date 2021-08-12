#假设一个网站包含两个表,Customers 表和 Orders 表.编写 SQL 查询以查找从不订购任何东西的所有客户.

#我的方法
#Runtime: 526 ms, faster than 22.60% of MySQL online submissions for Customers Who Never Order.
#Memory Usage: 0B, less than 100.00% of MySQL online submissions for Customers Who Never Order.

select Name as Customers
from Customers
where Id not in (
    select distinct CustomerId
    from Orders
);