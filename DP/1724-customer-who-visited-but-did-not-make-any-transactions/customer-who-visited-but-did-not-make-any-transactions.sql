# Write your MySQL query statement below
SELECT customer_id , count(*) as count_no_trans From Visits where visit_id not in (
    Select visit_id from Transactions
) group by customer_id ;