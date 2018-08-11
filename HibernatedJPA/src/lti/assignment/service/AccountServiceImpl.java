package lti.assignment.service;

import lti.assignment.repo.AccountRepository;
import lti.assignment.repo.AccountRepositoryImpl;

public class AccountServiceImpl implements AccountService {
	
	private AccountRepository repo;
	
	public AccountServiceImpl() {
		repo = new AccountRepositoryImpl();
	
	}

	@Override
	public void deposit(double amount) {
		
		repo.deposit(amount);
		
	}

	@Override
	public void withdraw(double amount) {
		
		repo.withdraw(amount);
		
	}

}
