create table employee(
employee_id int auto_increment primary key,
emp_name varchar(50) not null,
dept_name varchar(20) not null,
desi_name varchar(20) not null,
salary int not null
);
insert into employee (emp_name,dept_name,desi_name,salary) values('snehal','IT','Analyst','22000');
insert into employee (emp_name,dept_name,desi_name,salary) values('sachin','HEAD','CEO','65000');
insert into employee (emp_name,dept_name,desi_name,salary) values('aavi','IT','Manager','32000');
insert into employee (emp_name,dept_name,desi_name,salary) values('abhi','IT','Senior Analyst','28000');
