SELECT DEPTNO,SUM(SAL) 'TOTAL SALARY' FROM EMP
GROUP BY DEPTNO;

SELECT DEPTNO,MIN(SAL) LOWEST FROM EMP
WHERE DEPTNO=10
GROUP BY DEPTNO;

SELECT JOB,AVG(SAL) AVERAGE FROM EMP
WHERE JOB='MANAGER'
GROUP BY JOB;

SELECT JOB,SUM(SAL) 'TOTAL SALARY' FROM EMP
WHERE JOB='SALESMAN'
GROUP BY JOB;

SELECT DEPTNO,AVG(SAL) AS 'LOWEST AVERAGE SALARY' FROM EMP
GROUP BY DEPTNO;


SELECT DISTINCT(JOB) 'JOB ROLE' FROM EMP;

SELECT JOB,MAX(SAL) MAAXIMUM FROM EMP
WHERE JOB='ANALYST'
GROUP BY JOB;

SELECT MAX(ISNULL(COMM,0)) 'MAXIMUM COMMISION' FROM EMP;

SELECT COUNT(DISTINCT DEPTNO) 'NO OF DEPT' FROM DEPT;







