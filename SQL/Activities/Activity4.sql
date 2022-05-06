--ACTIVITY 4
--In this activity, we will be modifying the salesman table.

--Add a new column - grade - to the salesman table. The grade will be integer values.

alter table salesman add (grade int);

--Set the value in the grade column for everyone to 100.

update salesman set grade=100;

--Use SELECT command to display the results.

select * from salesman;