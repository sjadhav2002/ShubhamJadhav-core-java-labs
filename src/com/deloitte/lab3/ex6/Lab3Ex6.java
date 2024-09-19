package com.deloitte.lab3.ex6;

import java.util.Scanner;

public class Lab3Ex6 {
    
	public static boolean checkIncreasing(String str) {
		for (int i = 0;i<str.length();i++) {
			char currDigit = str.charAt(i);
			char nextDigit;
			if(i == str.length()-1) {
				nextDigit = str.charAt(i);
			}
			else {
				nextDigit = str.charAt(i+1);
			}
			
			
			if (currDigit>nextDigit) {
				return false;
			}
		}
	
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String n = sc.nextLine();
		System.out.println(checkIncreasing(n));
		sc.close();
	}
}
