package lti.pojo.one2many;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class DeptEmpTest {
	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();
		Department dept = new Department();
		dept.setDeptno(40);
		dept.setName("admin");
		dept.setLocation("Bandra, Mumbai");
		session.save(dept);
		txn.commit();
	}

	@Test
	public void testCase2() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();

		Department dept = (Department) session.get(Department.class, 40);

		Employee emp = new Employee();
		emp.setEmpno(1007);
		emp.setName("Gullu");
		emp.setSalary(70000);
		emp.setDept(dept);

		session.save(emp);
		txn.commit();
	}
	
	@Test
	public void testcase3() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();
		
		Department dept =  (Department) session.get(Department.class, 10);
		System.out.println(dept.getName());
		
		System.out.println(dept.getEmployees());
		txn.commit();
		
		
	}

}
