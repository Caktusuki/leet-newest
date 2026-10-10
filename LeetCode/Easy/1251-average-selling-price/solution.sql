# Write your MySQL query statement below
select p.product_id ,IFNull(Round(Sum(units*price)/Sum(units),2),0) as  average_price
from Prices p Left Join UnitsSold u 
ON p.product_id =u.product_id and u.purchase_date between start_date and end_date
group by product_id;
