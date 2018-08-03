package lti.bank;

public class TestAccount {

	public static void main(String[] args){
		Bank ac = AccountFactory.openAccount("savings","Polo");
		ac.summary();

		ac.deposit(2000);
		ac.deposit(4000);
		try {
			ac.withdraw(3000);
		} catch (BalanceException e2) {
			e2.printStackTrace();
		}
		try {
			
			ac.withdraw(7000);
		} catch (BalanceException e1) {
			e1.printStackTrace();
			e1.getMessage();
		}
		
		ac.statement();
		
		Bank ac2 = AccountFactory.openAccount("current","lili");
		ac2.summary();
		try {
			ac2.withdraw(3000);
		} catch (BalanceException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		try {
			ac2.withdraw(7000);
		} catch (BalanceException e) {
			e.printStackTrace();
			
		}
		ac2.deposit(2000);
		ac2.deposit(4000);
		ac2.statement();
		
		
		
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
