# Write your MySQL query statement below
SELECT activity_date AS day , COUNT(Distinct user_id) as active_users
FROM Activity
WHERE activity_date BETWEEN '2019-06-28' AND '2019-07-27'
Group BY activity_date