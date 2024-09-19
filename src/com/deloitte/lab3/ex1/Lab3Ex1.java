package com.deloitte.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Lab3Ex1 {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Integers separated by spaces:");
        String inputLine = sc.nextLine();
        
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        
        int sum = 0;
        System.out.println("The integers are:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            System.out.println(number);
            sum += number;
        }
        
        // Display the sum of the integers
        System.out.println("Sum :" + sum);
        
        // Close the scanner
        sc.close();
	}
}
