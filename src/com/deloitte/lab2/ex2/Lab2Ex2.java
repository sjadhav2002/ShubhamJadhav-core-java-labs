package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class Lab2Ex2 {

	public static String[] sortStrings(String[] str) {
		Arrays.sort(str);
		int len = str.length;
		int mid =0;
		if(len%2==0) {
			mid = len/2;
		}
		else {
			mid = (len+1)/2;
		}
		for(int i=0;i<len;i++) {
			if (i<mid) {
				str[i] = str[i].toUpperCase();
			}
			else {
				str[i] = str[i].toLowerCase();
			}
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		String[] str = {"abc", "def", "aabc", "bcde", "cdef"};
		str = sortStrings(str);
		for(String i : str)System.out.println(i);
		
	}
}
