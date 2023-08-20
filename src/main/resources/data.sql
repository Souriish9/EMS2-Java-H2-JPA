INSERT INTO LOCATIONS (LOCATION_ID, CITY, COUNTRY)
VALUES
(1, 'New York', 'USA'),
(2, 'London', 'UK'),
(3, 'Tokyo', 'Japan'),
(4, 'San Francisco', 'USA'),
(5, 'Paris', 'France');

INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME)
VALUES
(1, 'Engineering'),
(2, 'Marketing'),
(3, 'Analytics'),
(4, 'Sales'),
(5, 'Product Management'),
(6, 'UX/UI'),
(7, 'Finance'),
(8, 'Content'),
(9, 'Business Development'),
(10, 'Human Resources');

 

INSERT INTO JOBS (JOB_ID, JOB_TITLE, SALARY)
VALUES
(1, 'Software Engineer', 75000),
(2, 'Marketing Manager', 90000),
(3, 'Data Analyst', 60000),
(4, 'Sales Representative', 65000),
(5, 'Product Manager', 85000),
(6, 'UX Designer', 70000),
(7, 'Financial Analyst', 68000),
(8, 'Content Writer', 55000),
(9, 'Business Development Manager', 90000),
(10, 'HR Specialist', 60000);

 

 

INSERT INTO EMPLOYEES (EMPLOYEE_ID, EMPLOYEE_NAME, AGE, SEX, JOB_ID, DEPARTMENT_ID, LOCATION_ID)
VALUES
(1, 'John Doe', 30, 'Male', 1, 1, 1),
(2, 'Jane Smith', 28, 'Female', 2, 2, 1),
(3, 'Michael Johnson', 35, 'Male', 3, 2, 2),
(4, 'Emily Brown', 25, 'Female', 4, 4, 2),
(5, 'William Davis', 42, 'Male', 5, 5, 3),
(6, 'Sophia Wilson', 29, 'Female', 6, 6, 3),
(7, 'James Anderson', 38, 'Male', 7, 7, 1),
(8, 'Olivia Taylor', 31, 'Female', 8, 8, 4),
(9, 'Ethan Clark', 27, 'Male', 9, 9, 1),
(10, 'Ava Lee', 34, 'Female', 10, 10, 2),
(11, 'Benjamin Scott', 33, 'Male', 1, 1, 2),
(12, 'Mia Green', 26, 'Female', 2, 2, 3),
(13, 'Alexander Adams', 40, 'Male', 3, 3, 3),
(14, 'Chloe Turner', 28, 'Female', 4, 4, 2),
(15, 'Daniel Baker', 37, 'Male', 5, 5, 2),
(16, 'Isabella Wright', 29, 'Female', 6, 6, 3),
(17, 'Henry Cox', 36, 'Male', 7, 7, 3),
(18, 'Grace Murphy', 30, 'Female', 8, 8, 1),
(19, 'Jackson Hill', 32, 'Male', 9, 9, 1),
(20, 'Lily Torres', 39, 'Female', 10, 10, 2),
(21, 'Samuel Ramirez', 31, 'Male', 1, 1, 4),
(22, 'Lucy Foster', 27, 'Female', 2, 2, 1),
(23, 'Michael Allen', 34, 'Male', 3, 3, 1),
(24, 'Emma Price', 28, 'Female', 4, 4, 1),
(25, 'Andrew Bailey', 41, 'Male', 5, 5, 5),
(26, 'Avery Sanders', 29, 'Female', 6, 6, 2),
(27, 'Williamson Coleman', 37, 'Male', 7, 7, 2),
(28, 'Hannah Reed', 30, 'Female', 8, 8, 2),
(29, 'Jacob Bell', 28, 'Male', 9, 9, 3),
(30, 'Sofia Cox', 35, 'Female', 10, 10, 3),
(31, 'Aiden Kelly', 36, 'Male', 1, 1, 3),
(32, 'Abigail Wood', 29, 'Female', 2, 2, 1),
(33, 'Daniel Mitchell', 43, 'Male', 3, 3, 1),
(34, 'Elizabeth Stewart', 31, 'Female', 4, 4, 5),
(35, 'Elijah Turner', 33, 'Male', 5, 5, 1),
(36, 'Victoria Phillips', 32, 'Female', 6, 6, 5),
(37, 'Samuel Butler', 44, 'Male', 7, 7, 2),
(38, 'Scarlett Simmons', 30, 'Female', 8, 8, 3),
(39, 'Michael Parker', 34, 'Male', 9, 9, 3),
(40, 'Natalie Adams', 33, 'Female', 10, 10, 5),
(41, 'Josephine Bell', 45, 'Male', 3, 2, 1),
(42, 'Anthony Cox', 31, 'Female', 6, 4, 4),
(43, 'Madison Hill', 35, 'Male', 4, 3, 2),
(44, 'Christopher Torres', 34, 'Female', 5, 1, 3),
(45, 'Aria Ramirez', 46, 'Male', 7, 9, 3),
(46, 'Liam Sanders', 32, 'Female', 3, 7, 1),
(47, 'Sophia Phillips', 36, 'Male', 2, 6, 4),
(48, 'Noah Bennett', 37, 'Female', 9, 5, 2),
(49, 'Avery Simmons', 33, 'Male', 10, 4, 2),
(50, 'Grace Evans', 35, 'Female', 5, 3, 3);