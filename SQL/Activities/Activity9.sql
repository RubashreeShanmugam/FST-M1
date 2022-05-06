--Activity 9

--Write an SQL statement to know which salesman are working for which customer.
select C.customer_name , C.city, S.salesman_name, S.commission from customers C inner join salesman S on C.salesman_id = S.Salesman_id

--Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.
Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.

-- Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
select C.customer_name , C.city, S.salesman_name, S.commission from customers C inner join salesman S on C.salesman_id = S.Salesman_id 
where S.commission > 12

-- Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.
select O.order_no, O.order_date, O.purchase_amount, C.customer_name, C.city, S.salesman_name, S.grade, S.commission 
from Orders O inner join Customers C on O.customer_id=C.customer_id
inner join salesman S on O.salesman_id=S.salesman_id