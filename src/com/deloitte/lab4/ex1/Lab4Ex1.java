package com.deloitte.lab4.ex1;

public class Lab4Ex1 {
    public static void main(String[] args) {
    	Person p1 = new Person("Shubham",21);
        Account a = new Account(3000,p1);
        SavingsAccount sa = new SavingsAccount(3000, p1, 500);
        CurrentAccount ca = new CurrentAccount(3000, p1, 5000);
        
        System.out.println("Account bal: "+a.getBalance());
        try {
        	System.out.println("withdrawing 3000");
			a.withdraw(3000);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
        System.out.println("bal after withdrawal: "+a.getBalance());
        
        System.out.println("Saving Account bal: "+sa.getBalance());
        try {
        	System.out.println("withdrawing 3000");
			sa.withdraw(3000);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
        System.out.println("Saving bal after withdrawal: "+sa.getBalance());
        
        System.out.println("Saving Account bal: "+sa.getBalance());
        try {
        	System.out.println("withdrawing 2500");
			sa.withdraw(2500);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
        System.out.println("Saving bal after withdrawal: "+sa.getBalance());
        
        
        System.out.println("Currrent Account bal: "+ca.getBalance());
        try {
        	System.out.println("withdrawing 4500");
			ca.withdraw(4500);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		}
        System.out.println("Currrent bal after withdrawal: "+ca.getBalance());
        
    }
}
