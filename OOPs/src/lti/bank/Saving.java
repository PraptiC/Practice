package lti.bank;

public class Saving extends Account {

	public Saving() {
	}

	public Saving(String holder) {
		super(holder, MINIMUM_SAVING_BALANCE);
		
		tr[idx++] = new Transactions("OB", balance, balance); // Adding opening account transaction
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance - MINIMUM_SAVING_BALANCE)) {
			balance -= amount;
			tr[idx++] = new Transactions("Dr", amount, balance);
		} else
			throw new BalanceException("Insufficient Balance");
	}

}
