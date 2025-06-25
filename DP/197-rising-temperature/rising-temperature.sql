# Write your MySQL query statement below

SELECT a.id as ID from Weather a JOIN Weather b on DATEDIFF(a.recordDate,b.recordDate)=1 where a.temperature> b.temperature ;

