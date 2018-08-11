package lti.assignment.bean;

public class TransactionBean {
	
	private int trans_id;
	private String type;
	private double amount;
	private double balance;
	private AccountBean account;
	
	public int getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountBean getAccount() {
		return account;
	}

	public void setAccount(AccountBean account) {
		this.account = account;
	}

}
