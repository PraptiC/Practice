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
		dept.setDeptno(20);
		dept.setName("admin");
		dept.setLocation("Worli, Mumbai");
		session.save(dept);
		txn.commit();
	}

	@Test
	public void testCase2() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.beginTransaction();

		Department dept = (Department) session.get(Department.class, 10);

		Employee emp = new Employee();
		emp.setEmpno(1001);
		emp.setName("Prapti C");
		emp.setSalary(70000);
		emp.setDept(dept);

		session.save(emp);
		txn.commit();
	}

}
