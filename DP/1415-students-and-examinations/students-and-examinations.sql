# Write your MySQL query statement below

SELECT s.student_id , s.student_name , sb.subject_name ,count(e.subject_name) as  attended_exams from Students s cross join Subjects sb Left Join Examinations e on e.student_id = s.student_id  and e.subject_name = sb.subject_name
group by s.student_id , sb.subject_name, s.student_name 
order by s.student_id , sb.subject_name ;

