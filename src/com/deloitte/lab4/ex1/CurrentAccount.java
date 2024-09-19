package com.deloitte.lab4.ex1;

public class CurrentAccount extends Account{
	double overdraftLimit;
	CurrentAccount(double balance, Person p, double overdraftLimit) {
		super(balance, p);
		this.overdraftLimit = overdraftLimit;
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
        	throw new InsufficientBalanceException("Overdraft Limit exceeded");
        }
    }
	
}