# Write your MySQL query statement below
SELECT customer_id , count(*) as count_no_trans FROM Visits WHERE visit_id NOT IN ( 
    SELECT visit_id From Transactions  
)group by customer_id;
