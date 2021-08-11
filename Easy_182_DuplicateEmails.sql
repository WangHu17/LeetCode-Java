#求表中重复的邮箱名
#Runtime: 343 ms, faster than 34.42% of MySQL online submissions for Duplicate Emails.
#Memory Usage: 0B, less than 100.00% of MySQL online submissions for Duplicate Emails.

select Email
from Person
group by Email
having count(Email)>1;
