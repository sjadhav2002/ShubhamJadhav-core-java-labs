package com.deloitte.lab1.ex6;

public class CalculateDifference {

	public static int calculateDifference(int n) {
		int sum =0;
		int squareSum =0;
		
		for(int i= 1; i<=n;i++) {
			sum+=i;
			squareSum+=i*i;
		}
		int diff = (sum*sum)-squareSum;
		return diff;
	}
	
}
