# Write your MySQL query statement below
--  SELECT Count(user_id) from Users 
SELECT contest_id , 
       Round((Count(user_id)*1.0/(SELECT Count(user_id) from Users)*100),2)
        as percentage 
        from Register r 
        group by contest_id 
        order by percentage desc , contest_id;