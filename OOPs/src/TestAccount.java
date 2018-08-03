
public class TestAccount {

	public static void main(String[] args) {
		Bank ac = AccountFactory.openAccount("savings","Polo");
		ac.summary();

		ac.deposit(2000);
		ac.deposit(4000);
		ac.withdraw(3000);
		ac.withdraw(7000);
		
		ac.statement();
		
		
		
		/*System.out.println(ac.getBalance());

		ac.withdraw(4000);
		System.out.println(ac.getBalance());

		ac.withdraw(7000);
		Saving sa = new Saving("POLO");
		sa.summary();
		sa.withdraw(1000);
		
		Current cur = new Current("lili");
		cur.summary();
		cur.withdraw(3000);
		cur.summary();
		cur.withdraw(7000);
		cur.summary();
		cur.deposit(2000);
		cur.summary();
		cur.deposit(4000);
		cur.summary(); */
	}

}
