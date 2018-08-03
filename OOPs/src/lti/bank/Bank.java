package lti.bank;

public interface Bank {
	int INITIAL_ACCOUNT_NUMBER=1001;
	double MINIMUM_SAVING_BALANCE=1000;
	double INITIAL_CURRENT_BALANCE=5000;
	double MINIMUM_CURRENT_BALANCE=0;
	double OVERDRAFT_AMOUNT=10000;
	
	void summary();
	double getBalance();
	
	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
	
	void statement();
}
