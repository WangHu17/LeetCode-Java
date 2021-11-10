#编写一个 SQL 查询来报告 Employee 表中第 n 个最高的薪水.如果没有第 n 个最高薪水,则查询应报告 null.

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=N-1;
RETURN (
    select distinct salary
    from Employee
    order by salary desc
    limit N, 1
    );
END