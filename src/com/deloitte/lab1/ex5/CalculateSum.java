package com.deloitte.lab1.ex5;

public class CalculateSum {

	public int calculateSum(int n) {
		int sum=0;
		int no=0;
		int curr =0;
		while(no<=n) {
			if(curr%3==0 || curr%5==0) {
				sum += curr;
				no++;
			}
			curr++;
		}
		
		return sum;
	}
}
