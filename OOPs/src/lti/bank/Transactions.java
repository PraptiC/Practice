package lti.bank;

public class Transactions {
	protected String type;
	protected double amount, balance;

	public Transactions() {
	}

	public Transactions(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return type + "\t" + amount + "\t" + balance;
	}

}
