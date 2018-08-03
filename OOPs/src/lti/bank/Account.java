package lti.bank;

/**
 * 
 * @author Prapti & Shilpa
 *@version 1.0
 */

public abstract class Account implements Bank {
	private int accNo;
	private String holder;
	protected double balance;

	protected Transactions[] tr;
	protected int idx;

	private static int autogen = INITIAL_ACCOUNT_NUMBER;

	public Account() {
	}

	public Account(String holder, double balance) {

		this.accNo = autogen++;
		this.holder = holder;
		this.balance = balance;

		tr = new Transactions[10]; // Instantiating Transaction array for the account
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
		tr[idx++] = new Transactions("Cr", amount, balance);
	}

	public void statement() {
		System.out.println("Statement of Acc. " + accNo);
		for (int i = 0; i < idx; i++)
			System.out.println(tr[i]);
		System.out.println("\n\n\n");
	}

}
