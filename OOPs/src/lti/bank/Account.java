package lti.bank;

import java.util.Vector;

/**
 * 
 * @author Prapti & Shilpa
 *@version 1.0
 */

public abstract class Account implements Bank {
	private int accNo;
	private String holder;
	protected double balance;

	//protected Transactions[] vtr;
	protected int idx;
	Vector<Transactions> vtr = new Vector<Transactions>();
	private static int autogen = INITIAL_ACCOUNT_NUMBER;

	public Account() {
	}

	public Account(String holder, double balance) {

		this.accNo = autogen++;
		this.holder = holder;
		this.balance = balance;

		//tr = new Transactions[10]; // Instantiating Transaction array for the account
		//Vector<Transactions> vtr = new Vector<Transactions>();
	}

	public void summary() {
		System.out.println("A/c No: " + accNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		vtr.add(new Transactions("Cr", amount, balance));
	}

	public void statement() {
		System.out.println("Statement of Acc. " + accNo);
	//	for (int i = 0; i < idx; i++)
			for(Transactions t:vtr)
				System.out.println(t);
			//System.out.println(tr[i]);
		System.out.println("\n\n\n");
	}

}
