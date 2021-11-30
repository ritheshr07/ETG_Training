USE Organization;
CREATE TABLE Worker_Details (
	WORKER_ID INT NOT NULL PRIMARY KEY ,
	FIRST_NAME varCHAR(25),
	LAST_NAME varCHAR(25),
	SALARY INT,
	JOINING_DATE DATETIME,
	DEPARTMENT varCHAR(25)
);
INSERT INTO Worker_Details 
	(WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
		(001, 'Monika', 'Arora', 100000, 14-02-20, 'HR'),
		(002, 'Niharika', 'Verma', 80000, 14-06-11, 'Admin'),
		(003, 'Vishal', 'Singhal', 350000, 14-02-20, 'HR'),
		(004, 'Amitabh', 'Singh', 500000, 14-02-20, 'Admin'),
		(005, 'Vivek', 'Bhati', 504000, 14-06-11, 'Admin'),
		(006, 'Vipul', 'Diwan', 270000, 14-06-11, 'Account'),
		(007, 'Satish', 'Kumar', 75000, 14-01-20, 'Account'),
		(008, 'Geetika', 'Chauhan', 90000, 14-04-11, 'Admin'),
		(009, 'Deepthi', 'Pradhan', 55000, 14-04-21, 'Admin'),
(010, 'Ranjana', 'Radhakrisnan', 50000, 14-04-21, 'HR'),
(011, 'Jyothi', 'Rao', 60000, 14-05-21, 'Account'),
(012, 'Vidya', 'Jain', 40000, 14-06-21, 'Account'),
(013, 'Rajan', 'Mishra', 200000, 14-02-21, 'HR'),
(014, 'Madhumita', 'Roy', 600000, 15-06-21, 'HR'),
(015, 'Kiran', 'Kumar', 600000, 14-06-11, 'Admin'),
(016, 'Shalini', 'Patil', 800000, 19-03-21, 'Training'),
(017, 'Manu', 'Giridhar', 300000, 10-10-21, 'Training'),
(018, 'Ravi', 'Rao', 500000, 09-07-21, 'Training'),
(019, 'Arun', 'Rao', 600000, 03-03-21, 'Training'),
(020, 'Ashok', 'Kumar', 400000, 10-11-21, 'Training'),
(021, 'Vidya', 'Lakashmi', 300000, 08-07-21, 'Training');


CREATE TABLE Bonus (
	WORKER_REF_ID INT,
	BONUS_AMOUNT INT,
	BONUS_DATE DATETIME,
	FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker_Details(WORKER_ID)
        ON DELETE CASCADE
);

INSERT INTO Bonus 
	(WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
		(001, 5000, 16-02-20),
		(002, 3000, 16-06-11),
		(003, 4000, 16-02-20),
		(001, 4500, 16-02-20),
		(012, 5500, 16-06-21),
		(010, 3000, 16-07-21),
		(008, 2500, 22-06-21),
		(007, 3000, 11-05-15),
		(005, 4000, 16-06-19);

CREATE TABLE Title (
	WORKER_REF_ID INT,
	WORKER_TITLE VarCHAR(25),
	AFFECTED_FROM DATETIME,
	FOREIGN KEY (WORKER_REF_ID)
		REFERENCES Worker_Details (WORKER_ID)
        ON DELETE CASCADE
);
INSERT INTO Title 
	(WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) VALUES
 (001, 'Manager', 2016-02-20),
 (002, 'Executive', 2016-06-11),
 (008, 'Executive', 2016-06-11),
 (005, 'Manager', 2016-06-11),
 (004, 'Consultant', 2016-06-11),
 (007, 'Executive', 2016-06-11),
 (006, 'Lead', 2016-06-11),
 (003, 'Lead', 2016-06-11),
(009, 'Executive', 2021-06-11),
(010, 'Lead', 2021-07-11),
(011, 'Executive', 2021-08-11),
(012, 'Executive', 2021-07-11),
(013, 'Executive', 14-02-21),
(014, 'Senior Manager', 15-06-21),
(015, 'Vice President', 14-06-11),
(016, 'Vice President', 19-03-21),
(017, 'President',10-10-21),
(018, 'Trainer', 09-07-21),
(019, 'Consultant', 03-03-21),
(020, 'Manager', 10-11-21),
(021, 'Lead', 08-07-21);