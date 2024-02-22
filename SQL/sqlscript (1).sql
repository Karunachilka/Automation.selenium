REM   Script: Sql-ibm-mf-testing
REM   testing

select * from scott.emp;

select * from scott.emp;

select * from scott.emp;

select * from scott.emp;

select * from scott.emp where depno=30;

select * from scott.emp where deptno=30;

select empno,ename,job from scott.emp where deptno<30;

select empno,ename,job from scott.emp where deptno<30;

select empno,ename,job,deptno from scott.emp where deptno<30;

select empno,ename,job,deptno from scott.emp where deptno>10 and deptno<30;

select empno,ename,job,deptno from scott.emp where deptno between 10 and 30;

select empno,ename,job,deptno from scott.emp where deptno in (10,30);

select * from scott.emp;

select * from scott.emp where sal > 3000;

