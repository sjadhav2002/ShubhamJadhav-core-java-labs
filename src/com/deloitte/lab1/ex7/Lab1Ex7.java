package com.deloitte.lab1.ex7;
import java.util.Scanner;


public class Lab1Ex7 {

	public static boolean checkIncreasing(int n) {
		int lastDigit, previousDigit;
		
		lastDigit = previousDigit = n%10;
		
		while(n>0) {
			lastDigit = n%10;
			if(lastDigit > previousDigit) {
				return false;
			}
			previousDigit = lastDigit;
			n = n/10;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		System.out.println(checkIncreasing(n));
		sc.close();
	}
}
