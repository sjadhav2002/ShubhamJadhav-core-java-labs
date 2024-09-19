package com.deloitte.lab6.ex5;

import java.util.Arrays;

public class Lab6Ex5 {
    
	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	}
	
	public static void main(String[] args) {
		int[] a = {2,3,6,4,5,9,7,1};
		System.out.println(getSecondSmallest(a));
	}
}
