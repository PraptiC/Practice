package lti.assignment.bean;

import java.util.HashSet;
import java.util.Set;

public class AccountBean {
	
	private int accNo;
	private String holder;
	private double balance;
	
	private Set <TransactionBean> transactions = new HashSet <TransactionBean>();

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Set<TransactionBean> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<TransactionBean> transactions) {
		this.transactions = transactions;
	}
	
	
	
}
