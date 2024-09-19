package com.deloitte.lab9.ex2;

import java.util.function.Function;

public class Lab9Ex2 {
    
	public static void main(String[] args) {
    	Function<String, String> addSpace = (x) -> {
    		StringBuilder sb = new StringBuilder();
    		for (char c : x.toCharArray()) {
    			sb.append(c);
    			sb.append(" ");
    		}
    		return sb.toString();
    	};

        String x = "Shubham";
        String result = addSpace.apply(x);

        System.out.println(result);
    }
}