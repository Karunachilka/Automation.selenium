REM   Script: Session 05
REM   SESSION

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

select e.empno,e.ename,m.ename as "mgr name" from scott.emp e , scott.emp m 
where e.empno=m.mgr;t;

select e.empno,e.ename,m.ename as "mgr name" from scott.emp e , scott.emp m 
where e.empno=m.mgr;t;

select empno,ename,d.deptno,dname 
from scott.emp e,scott.dept d 
where d.deptno=e.deptno;

select empno,ename,e.deptno,dname 
 from scott.dept e left join scott.emp d 
on d.deptno=e.deptno;

select * from hr.employees ;

select empno,ename,e.deptno,dname 
 from scott.dept e left join scott.emp d 
on d.deptno=e.deptno;

select empno,ename,d.deptno,dname 
 from scott.emp e inner join scott.dept d 
on d.deptno=e.deptno;

select employee_id,first_name,last_name,d.department_id,department_name 
 from hr.employees e  
    full outer  join hr.departments d 
     
on e.department_id=d.department_id;

select distinct deptno from scott.emp;

select e.empno,e.ename,m.ename as "mgr name" from scott.emp e , scott.emp m 
where e.empno=m.mgr.t;

select e.empno,e.ename,m.ename as "mgr name" from scott.emp e , scott.emp m 
where e.empno=m.mgr;t;

select e.empno,e.ename,m.ename as "mgr name" from scott.emp e , scott.emp m 
where e.empno=m.mgr;t;

select employee_id,first_name,last_name,d.department_id,department_name 
 from hr.employees e  
    cross outer  join hr.departments d;

