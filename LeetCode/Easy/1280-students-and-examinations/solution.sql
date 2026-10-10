# Write your MySQL query statement below
select s.student_id, s.student_name, sub.subject_name,
       count(e.subject_name) as attended_exams
from Students s
#it so we can check all namses for the give subject s
cross join Subjects sub
left join Examinations e
on s.student_id = e.student_id
and sub.subject_name = e.subject_name
group by s.student_id, s.student_name, sub.subject_name
order by s.student_id asc, sub.subject_name asc;
