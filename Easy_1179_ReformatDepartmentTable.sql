#编写一个 SQL 查询来重新格式化表,以便每个月都有一个部门 ID 列和一个收入列.以任意顺序返回结果表.
Input:
Department table:
+------+---------+-------+
| id   | revenue | month |
+------+---------+-------+
| 1    | 8000    | Jan   |
| 2    | 9000    | Jan   |
| 3    | 10000   | Feb   |
| 1    | 7000    | Feb   |
| 1    | 6000    | Mar   |
+------+---------+-------+
Output:
+------+-------------+-------------+-------------+-----+-------------+
| id   | Jan_Revenue | Feb_Revenue | Mar_Revenue | ... | Dec_Revenue |
+------+-------------+-------------+-------------+-----+-------------+
| 1    | 8000        | 7000        | 6000        | ... | null        |
| 2    | 9000        | null        | null        | ... | null        |
| 3    | null        | 10000       | null        | ... | null        |
+------+-------------+-------------+-------------+-----+-------------+

select id,
       sum(case when month='Jan' then revenue else null end) as Jan_Revenue,
       sum(case when month='Feb' then revenue else null end) as Feb_Revenue,
       sum(case when month='Mar' then revenue else null end) as Mar_Revenue,
       sum(case when month='Apr' then revenue else null end) as Apr_Revenue,
       sum(case when month='May' then revenue else null end) as May_Revenue,
       sum(case when month='Jun' then revenue else null end) as Jun_Revenue,
       sum(case when month='Jul' then revenue else null end) as Jul_Revenue,
       sum(case when month='Aug' then revenue else null end) as Aug_Revenue,
       sum(case when month='Sep' then revenue else null end) as Sep_Revenue,
       sum(case when month='Oct' then revenue else null end) as Oct_Revenue,
       sum(case when month='Nov' then revenue else null end) as Nov_Revenue,
       sum(case when month='Dec' then revenue else null end) as Dec_Revenue
from Department
group by id
order by id;