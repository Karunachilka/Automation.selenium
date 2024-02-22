REM   Script: Session 02
REM   2

SELECT empno, ename, sal, deptno  
FROM scott.emp e  
WHERE sal > (  
    SELECT AVG(sal)  
    FROM scott.emp  
    WHERE deptno = e.deptno  
);

SELECT AVG(sal)  
    FROM scott.emp;

SELECT AVG(sal)  
    FROM scott.emp;

SELECT AVG(sal)  
    FROM scott.emp;

SELECT AVG(sal)  
    FROM scott.emp;

select deptno,sum(sal) from scott.emp group by deptno;

