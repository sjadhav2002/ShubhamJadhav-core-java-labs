package com.deloitte.lab3.ex3;
import java.util.Scanner;

public class Lab3Ex3 {
    
	public static boolean checkvowel(char c) {
		char[] vowels = {'a','e','i','o','u'};
		for (int element : vowels) {
            if (element == c) {
                return true;
            }
        }
		return false;
	}
	
	public static String alterString(String str) {
	        StringBuilder result=new StringBuilder();
	        
	        for(char c : str.toCharArray()) {
	        	if (checkvowel(c)) {
	        		result.append(c);
	        	}
	        	else {
	        		if(c == 'z') {
	        			result.append('a');
	        		}else {
	        			c++;
	        			result.append(c);
	        		}
	        	}
	        }
	       return result.toString();
	}
	
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String result = alterString(str);
        System.out.println(result);
        
        
        
        sc.close();
        
    }
}
