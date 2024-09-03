create database org;
use org;

create table employee(
id int primary key auto_increment,
emp_name varchar(30) not null,
emp_dob date not null,
emp_mob varchar(10) not null,
emp_email varchar(30) not null,
emp_aadhar varchar(30) not null,
emp_pan varchar(30) not null
)

create table emp_contact(
id int primary key auto_increment,
emp_id int references employee(id),
emp_mob2 varchar(10) not null,
emp_email2 varchar(10) not null
)

alter table emp_contact modify emp_email2 varchar(30);

create table emp_communication(
id int primary key auto_increment,
emp_id int references employee(id),
emp_add1 varchar(100) not null,
emp_add22 varchar(100) not null
)

create table emp_dept(
id int primary key auto_increment,
emp_id int references employee(id),
emp_deptName varchar(20) not null,
emp_location varchar(10) not null
)

alter table emp_dept modify emp_deptName varchar(30);
alter table emp_dept 
rename column emp_location to emp_deptLocation;

create table emp_reg(
id int primary key auto_increment,
emp_id int references employee(id),
emp_joiningDate date not null,
emp_deptID int references emp_dept(id),
emp_post varchar(20)
)

alter table emp_reg modify emp_post varchar(40);


create table emp_payroll(
id int primary key auto_increment,
emp_id int references employee(id),
emp_postName varchar(40) references emp_reg(emp_post),
emp_salary decimal  not null
)

insert into employee values(null,'Aksh','1998-10-2','8729739537','aksh@gmail.com','245378532809','AB354672');

select * from employee;

insert into emp_contact values(null,1,'9835284519','aksh233@gmail.com'); 

insert into employee values(null,'Neha','1997-1-20','9845216278','riya@gmail.com','541298754265','AD8742365'),
(null,'Seema','1996-11-21','9854365175','seema@gmail.com','987426315697','AD987461'),
(null,'Akash','1997-5-22','8546315239','akash@gmail.com','756942355859','AF987452'),
(null,'Sameer','1996-11-7','9842365792','sameer@gmail.com','856941236578','AD784269'),
(null,'Aarav','1995-7-13','8742369851','aarav@gmail.com','874526951369','AB987126'),
(null,'Sujal','1998-3-2','9168395783','sujal@gmail.com','965412387593','AD874269'),
(null,'Riya','1998-10-7','7218430908','riya@gmail.com','987426894126','AF987452'),
(null,'Saniya','1997-6-9','9874256318','saniya@gmail.com','984265713598','AD842695'),
(null,'Rohan','1995-12-31','9874521632','riya@gmail.com','541298754265','AD8742365');

delete from employee where id=10;
insert into employee values(null,'Rohan','1995-12-31','9654123875','rohan@gmail.com','698741235896','AD756984');

select * from emp_contact;
insert into emp_contact values(null,1,'9845632178','aksh56@gmail.com'),
(null,2,'9874516549','neha783@gmail.com'),
(null,3,'8742365984','seema534@gmail.com'),
(null,4,'9745632184','aksh423@gmail.com'),
(null,5,'7569412358','sameer329@gmail.com'),
(null,6,'8456321759','aarav872@gmail.com'),
(null,7,'8745632198','sujal325@gmail.com'),
(null,8,'6759846851','riya072@gmail.com'),
(null,9,'7569841785','saniya689@gmail.com'),
(null,11,'9635874158','rohan928@gmail.com');

select * from emp_contact;

insert into emp_communication values(null,1,'Mumbai','Mumbai'),
(null,2,'MP','Mumbai'),
(null,3,'Gujrat','Mumbai'),
(null,4,'Ratnagiri','Mumbai'),
(null,5,'Delhi','Mumbai'),
(null,6,'Bengluru','Mumbai'),
(null,7,'Pune','Mumbai'),
(null,8,'Manipur','Mumbai'),
(null,9,'Noida','Mumbai'),
(null,11,'Kerala','Mumbai');

select * from emp_communication;

insert into emp_dept values(null,1,'Human Resources(HR)','2nd Floor'),
(null,2,'Marketing','3rd Floor)'),
(null,3,'Sales','4th Floor'),
(null,4,'Information technology','1st Floor'),
(null,5,'Customer service','5th Floor'),
(null,6,'Executive','6th Floor'),
(null,7,'Finance','7th Floor'),
(null,8,'Research And Development','8th Floor'),
(null,9,'Operations','9th Floor'),
(null,11,'Legal','10th Floor');

select * from emp_dept;

insert into emp_reg values(null,1,'2017-2-23',11,'HR manager'),
(null,2,'2020-6-9',12,'Content Writer'),
(null,3,'2019-7-21',13,'Sales Representative'),
(null,4,'2018-1-2',14,'Software Developer'),
(null,5,'2019-4-17',15,'Account Manager'),
(null,6,'2016-8-21',16,'Chief Executive Officer'),
(null,7,'2017-3-8',17,'Accountant'),
(null,8,'2018-8-29',18,'Product Developer'),
(null,9,'2017-9-8',19,'Operations Manager'),
(null,11,'2022-2-23',20,'Lawyer');

select * from emp_reg;

insert into emp_payroll values(null,1,'HR manager',50000),
(null,2,'Content Writer',20000),
(null,3,'Sales Representative',350000),
(null,4,'Software Developer',50000),
(null,5,'Account Manager',40000),
(null,6,'Chief Executive Officer',60000),
(null,7,'Accountant',40000),
(null,8,'Product Developer',45000),
(null,9,'Operations Manager',55000),
(null,11,'Lawyer',53000);

select * from emp_payroll;

select * from employee e join emp_contact ec on e.id=ec.emp_id;
select emp_name,emp_mob2 from employee e join emp_contact ec on e.id=ec.emp_id;
select * from employee e join emp_communication ecc on e.id=ecc.emp_id;

select * from employee e join emp_payroll ep  on e.id= ep.emp_id;
 select  emp_name,emp_deptName from employee e join emp_dept ed on e.id=ed.emp_id;




