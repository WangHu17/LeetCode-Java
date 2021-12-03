#编写
SQL 查询以查找每个部门中薪水最高的员工. 以任意顺序返回结果表.
Input:
Employee table:
+----+-------+--------+--------------+
| id | name  | salary | departmentId |
+----+-------+--------+--------------+
| 1  | Joe   | 70000  | 1            |
| 2  | Jim   | 90000  | 1            |
| 3  | Henry | 80000  | 2            |
| 4  | Sam   | 60000  | 2            |
| 5  | Max   | 90000  | 1            |
+----+-------+--------+--------------+
Department table:
+----+-------+
| id | name  |
+----+-------+
| 1  | IT    |
| 2  | Sales |
+----+-------+
Output:
+------------+----------+--------+
| Department | Employee | Salary |
+------------+----------+--------+
| IT         | Jim      | 90000  |
| Sales      | Henry    | 80000  |
| IT         | Max      | 90000  |
+------------+----------+--------+

select Department.name as Department,
       Employee.name as Employee,
       salary as Salary
from Employee
         join Department
              on Employee.departmentId = Department.id
where (departmentId, salary) in (
    select departmentId, max(salary)
    from Employee
    group by departmentId
);