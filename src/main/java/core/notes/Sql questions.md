1. SQL Query to find second highest salary of Employee
   select MAX(Salary) from Employee WHERE Salary NOT IN (select MAX(Salary) from Employee ); 
   
2. Write SQL Query to find duplicate rows in a database? and then write SQL query to delete them?
	SELECT * FROM emp a WHERE rowid = (SELECT MAX(rowid) FROM EMP b WHERE a.empno=b.empno)
	DELETE FROM emp a WHERE rowid != (SELECT MAX(rowid) FROM emp b WHERE a.empno=b.empno);
	
3. There is a table which contains two column Student and Marks, you need to find all the students, 
	whose marks are greater than average marks i.e. list of above average students
	SELECT student, marks from table where marks > SELECT AVG(marks) from table);
	
4. How do you find all employees which are also manager? .
	SELECT e.name, m.name FROM Employee e, Employee m WHERE e.mgr_id = m.emp_id;

Read more: http://java67.blogspot.com/2013/04/10-frequently-asked-sql-query-interview-questions-answers-database.html#ixzz4B0FBADhB
Read more: http://java67.blogspot.com/2013/04/10-frequently-asked-sql-query-interview-questions-answers-database.html#ixzz4B0F51mB9
