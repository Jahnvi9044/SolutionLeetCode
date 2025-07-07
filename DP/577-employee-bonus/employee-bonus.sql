# Write your MySQL query statement below
select name, bonus from Employee as e left Join Bonus as b on b.empId=e.empId  where bonus<1000 or bonus is null; 