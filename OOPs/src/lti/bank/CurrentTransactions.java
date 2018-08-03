package lti.bank;

public class CurrentTransactions extends Transactions {
	private double overDraft;

	public CurrentTransactions() {
	}

	public CurrentTransactions(String type, double amount, double balance,double overDraft) {
		super(type,amount,balance);
		this.overDraft = overDraft;
	}
	
	
	public String toString() {
		return super.toString() + "\t"+overDraft;
	}
	
	

}
