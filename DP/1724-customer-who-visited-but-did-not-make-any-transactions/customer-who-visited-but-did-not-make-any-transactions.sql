# Write your MySQL query statement below
SELECT customer_id , count(*) as count_no_trans FROM Visits WHERE visit_id NOT IN  
(SELECT v.visit_id from Visits v  join Transactions  t  on  v.visit_id=t.visit_id) group by customer_id;
