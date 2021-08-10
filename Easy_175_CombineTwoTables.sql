#联结查询两张表
#Runtime: 456 ms, faster than 10.02% of MySQL online submissions for Combine Two Tables.
#Memory Usage: 0B, less than 100.00% of MySQL online submissions for Combine Two Tables.

select p.FirstName, p.LastName, a.City, a.State
from Person p
left join Address a
on p.PersonId = a.PersonId;

#不用别名快一些
#Runtime: 277 ms, faster than 85.09% of MySQL online submissions for Combine Two Tables.
#Memory Usage: 0B, less than 100.00% of MySQL online submissions for Combine Two Tables.

select FirstName, LastName, City, State
from Person
left join Address
on Person.PersonId = Address.PersonId;