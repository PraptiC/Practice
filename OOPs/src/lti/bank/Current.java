package lti.bank;

import java.util.Vector;

public class Current extends Account {
	private double overDraft;
	Vector<CurrentTransactions> vtr = new Vector<CurrentTransactions>();

	public Current() {
	}

	public Current(String holder) {
		super(holder, 5000);
		this.overDraft = OVERDRAFT_AMOUNT;
		// tr = new CurrentTransactions[10]; // Instantiating Transaction array for the
		// account

		vtr.add(new CurrentTransactions("OB", balance, balance, overDraft));

		// tr[idx++] = new CurrentTransactions("OB", balance, balance,overDraft); //
		// Adding opening account transaction
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft: " + overDraft);
	}

	@Override
	public void deposit(double amount) {
		overDraft += amount;
		if (overDraft > OVERDRAFT_AMOUNT) {
			balance += overDraft - OVERDRAFT_AMOUNT;
			overDraft = OVERDRAFT_AMOUNT;
		}
		//vtr[idx++] = new CurrentTransactions("Cr", amount, balance, overDraft);
		vtr.add(new CurrentTransactions("Cr", amount, balance, overDraft));
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance + overDraft)) {
			balance -= amount;
			if (balance < MINIMUM_CURRENT_BALANCE) {
				overDraft += balance;
				balance = MINIMUM_CURRENT_BALANCE;
			}
			//tr[idx++] = new CurrentTransactions("Dr", amount, balance, overDraft);
			vtr.add( new CurrentTransactions("Dr", amount, balance, overDraft));
		} else
			throw new BalanceException("Insufficient funds");

	}

}
