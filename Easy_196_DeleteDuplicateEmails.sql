#Runtime: 1554 ms, faster than 77.01% of MySQL online submissions for Delete Duplicate Emails.
#Memory Usage: 0B, less than 100.00% of MySQL online submissions for Delete Duplicate Emails.

delete p1
from Person p1,Person p2
where p1.Email=p2.Email and p1.Id>p2.Id