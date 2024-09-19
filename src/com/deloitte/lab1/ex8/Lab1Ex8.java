package com.deloitte.lab1.ex8;
import java.util.Scanner;
public class Lab1Ex8 {
	public static boolean checkPow(int n) {
		
		if(n==0) {
			return false;
		}
		
		double x = Math.log(n) / Math.log(2);
		
		return x == (int)x;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		System.out.println(checkPow(n));
		sc.close();
	}

}
