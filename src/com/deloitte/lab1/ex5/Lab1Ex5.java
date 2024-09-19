package com.deloitte.lab1.ex5;

import java.util.Scanner;

public class Lab1Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		CalculateSum obj = new CalculateSum();
		System.out.println(obj.calculateSum(n));
		sc.close();
	}

}
