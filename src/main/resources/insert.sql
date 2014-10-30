INSERT INTO Adress
	(CITY, STREET) 
VALUES 
	('kh', 'new'),
	('kv', 'Mid'),
	('lv', 'yak');
	
INSERT INTO Employee
	(FNAME, LNAME, ADR_FK) 
VALUES 
	('vlad', 'mak', 1), 
	('dim', 'bak', 1), 
	('il', 'lad', 2);
	
INSERT INTO PHONE_NUMBERS
	(EMPLOYEE_ID, STYLE, NUMBER) 
VALUES 
	(1, 'dom', '3360115'),
	(1, 'mob', '2568596'),
	(2, 'mob', '3248596');

