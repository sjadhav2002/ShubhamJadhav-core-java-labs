package com.deloitte.lab9.ex5;

import java.util.function.Function;



public class Lab9Ex5 {
    
	public static int getFactorial (int n) {
		int i,factorial=1;      
		  for(i=1;i<=n;i++){    
			  factorial=factorial*i;    
		  }    
		return factorial;
	}
	
    public static void main(String[] args) {
        int n=5;
        Function<Integer, Integer> factorialFunction = Lab9Ex5::getFactorial;
        System.out.println(factorialFunction.apply(n));
    }
}
