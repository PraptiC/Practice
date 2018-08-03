
public class TestEmployee {

	public static void main(String[] args) {
		/*
		 * Employee e1 = new Employee("Polo", 5000);
		e1.payslip();
		*/

		Manager m1 = new Manager("John", 4500, 200);
		/*
		 * m1.payslip(); double sal = m1.getSalary(); System.out.println("salary " +
		 * sal);
		 */
		showSalary(m1);

		Executive ex1 = new Executive("Johnny", 6600, 300);

		/*
		 * ex1.payslip(); /*double sal2 = ex1.getSalary(); System.out.println("salary "
		 * + sal2);
		 */
		showSalary(ex1);

	}

	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());

		
	}
	

//	private static void showSalary(Executive ex1) {
//		System.out.println("Executive salary: " + ex1.getSalary());
//	}
//
//	private static void showSalary(Manager m1) {
//		System.out.println("Manager Salary: " + m1.getSalary());
//	}

}
