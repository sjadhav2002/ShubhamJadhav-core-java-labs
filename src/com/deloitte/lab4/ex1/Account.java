package com.deloitte.lab4.ex1;

import java.util.Random;

public class Account{
	long accNum;
	double balance;
	Person accHolder;
	
	Account(double balance, Person p){
		this.balance = balance;
		this.accHolder = p;
		Random random = new Random();
		long min = 100000000000L;
        long max = 999999999999L;
        this.accNum = min + ((long)(random.nextDouble() * (max - min)));
	}
	
	public void deposit (double amt) {
		this.balance += amt;
	}
	public void withdraw (double amt) throws InsufficientBalanceException {
		if(balance<amt) {
			throw new InsufficientBalanceException("InsufficientBalance");
		}
		this.balance -= amt;
	}
	public double getBalance () {
		return balance;
	}
	
}
