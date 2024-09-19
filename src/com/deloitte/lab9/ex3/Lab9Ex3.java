package com.deloitte.lab9.ex3;

import java.util.function.BiFunction;

public class Lab9Ex3 {
    
	public static void main(String[] args) {
    	BiFunction<String, String, Boolean> authenticate = (x, y) -> {
    		if (x.equals("Shubham") && y.equals("abc")) {
                return true;
            } else {
                return false;
            }
    	};

        String x = "Shubham";
        String y = "abc";
        boolean result = authenticate.apply(x, y);
        System.out.println(result);
        x = "Shubham";
        y = "abcd";
        result = authenticate.apply(x, y);

        System.out.println(result);
    }
}