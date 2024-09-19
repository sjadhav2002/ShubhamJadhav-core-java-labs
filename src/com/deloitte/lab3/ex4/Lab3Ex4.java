package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class Lab3Ex4 {
	
	public static int modifyNumber(int number1) {
	        String number = Integer.toString(number1);
	       StringBuilder s = new StringBuilder();
	       
	        for(int i=0;i<number.length();i++) {
	        	Character currentChar = (number.charAt(i));
	        	if(i == number.length()-1) {
	        		s.append(currentChar);
	        	}
	        	else {
	        		Character nextChar = (number.charAt(i+1));
	        		Integer currentNumber = Integer.parseInt(currentChar.toString());
	        		Integer nextNumber = Integer.parseInt(nextChar.toString());
	        		Integer difference = Math.abs(currentNumber - nextNumber);
	        		s.append(difference.toString());
	        	}
	        	
	        }
	      
	       return Integer.parseInt(s.toString());
	}
	
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        int n = sc.nextInt();
        int result = modifyNumber(n);
        System.out.println(result);
        
        
        
        sc.close();
        
    }
}
