package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BankAccount {
	
	int accountId;
	String accountHolderNameString;
	String accountTypeString;
	double accountBalance;	
		
	public BankAccount() {

		
	}
	public BankAccount(int accountId, String accountHolderNameString, String accountTypeString, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderNameString = accountHolderNameString;
		this.accountTypeString = accountTypeString;
		this.accountBalance = accountBalance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderNameString() {
		return accountHolderNameString;
	}
	public void setAccountHolderNameString(String accountHolderNameString) {
		this.accountHolderNameString = accountHolderNameString;
	}
	public String getAccountTypeString() {
		return accountTypeString;
	}
	public void setAccountTypeString(String accountTypeString) {
		this.accountTypeString = accountTypeString;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderNameString=" + accountHolderNameString
				+ ", accountTypeString=" + accountTypeString + ", accountBalance=" + accountBalance + "]";
	}
}