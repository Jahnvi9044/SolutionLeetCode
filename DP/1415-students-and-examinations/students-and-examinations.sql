# Write your MySQL query statement below


select s.student_id ,s.student_name ,sb.subject_name , count(e.subject_name) as attended_exams from Students as s cross Join  Subjects as sb left join Examinations as e on s.student_id = e.student_id and  sb.subject_name = e.subject_name  
group by s.student_id, s.student_name,sb.subject_name 
order by s.student_id, sb.subject_name; 



