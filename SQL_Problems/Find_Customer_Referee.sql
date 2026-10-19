-- 584. Find Customer Referee

SELECT name 
From Customer
Where referee_id != 2 OR referee_id IS NULL;
