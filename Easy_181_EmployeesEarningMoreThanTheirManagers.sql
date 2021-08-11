#求收入超过经理的员工姓名
#Runtime: 393 ms, faster than 28.89% of MySQL online submissions for Employees Earning More Than Their Managers.
#Memory Usage: 0B, less than 100.00% of MySQL online submissions for Employees Earning More Than Their Managers.

select e.Name as Employee
from Employee e,Employee m
where e.ManagerId = m.Id and e.Salary > m.Salary;