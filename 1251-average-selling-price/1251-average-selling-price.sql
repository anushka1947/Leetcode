# Write your MySQL query statement below
SELECT p.product_id,IFNULL(round(SUM(p.price * u.units)/sum(u.units),2),0) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id 
AND u.purchase_date BETWEEN p.start_date and p.end_date
Group BY p.product_id