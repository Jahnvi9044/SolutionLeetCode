# Write your MySQL query statement below
SELECT project_id, round(avg(experience_years),2) as average_years from Project p JOIN Employee e on p.employee_id = e.employee_id group by p.project_id;