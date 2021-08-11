#求表中一个字段的第二最大值,如果没有就返回null
#Runtime: 169 ms, faster than 83.50% of MySQL online submissions for Second Highest Salary.
#Memory Usage: 0B, less than 100.00% of MySQL online submissions for Second Highest Salary.

select ifnull(
               (select distinct Salary
                from Employee
                order by Salary desc
                   limit 1,1),null)
           as SecondHighestSalary;