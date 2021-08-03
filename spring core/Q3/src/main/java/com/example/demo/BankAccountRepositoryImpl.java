package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class BankAccountRepositoryImpl implements BankAccountRepository {
	
	@Autowired
       BankAccount bankAccount;
	
	
	private List<BankAccount> list = new ArrayList<>();
	
	public BankAccountRepositoryImpl() {
		
		list.add(new BankAccount (1,"Mike","Savings",30.00));
		
		list.add(new BankAccount (2,"Bob","Savings",10.00));
		
		list.add(new BankAccount (3,"Tyson","Current",20.00));
		
		list.add(new BankAccount (4,"Milli","Savings",40.00));
	}

	@SuppressWarnings("null")
	@Override
	public double getBalance(int accountId) {
		// TODO Auto-generated method stub
	
	for(BankAccount B : list) {
		if(B.getAccountId() == accountId) {
			return B.accountBalance;
		}
	}
	return (Double) null;
	}
	
	

	@SuppressWarnings("null")
	@Override
	public double updateBalance(int accountId,double accountBalance) {
		for(BankAccount B : list) {
			if(B.getAccountId() == accountId) {		
				B.setAccountBalance(accountBalance);
				return B.accountBalance;
			}
		}
		return (Double) null;
	}
	



}