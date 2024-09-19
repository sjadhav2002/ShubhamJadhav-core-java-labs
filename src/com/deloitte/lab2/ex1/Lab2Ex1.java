package com.deloitte.lab2.ex1;

import java.util.Arrays;

public class Lab2Ex1 {
	
	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	}
	
	public static void main(String[] args) {
		int[] a = {2,3,6,4,5,9,7,1};
		System.out.println(getSecondSmallest(a));
	}
}
