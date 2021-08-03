package com.example.demo;

public interface BankAccountRepository {
	public double getBalance(int accountId);

	public double updateBalance(int accountId ,double accountBalance);	
}
