package com.deloitte.lab1.ex6;
import java.util.Scanner;



public class Lab1Ex6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		System.out.println(CalculateDifference.calculateDifference(n));
		sc.close();
	}
}
