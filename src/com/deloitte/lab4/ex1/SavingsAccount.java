package com.deloitte.lab4.ex1;

public class SavingsAccount extends Account{
	long minBal;
	SavingsAccount(double balance, Person p, int minBal) {
		super(balance, p);
		this.minBal = minBal;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw (double amt) throws InsufficientBalanceException {
		if(balance - amt < minBal) {
			throw new InsufficientBalanceException("Minimum "+minBal+" balance required");
		}
		balance -= amt;
	}
}
