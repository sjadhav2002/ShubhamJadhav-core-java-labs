package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {
	
	public static int recursive(int n) {
        if (n <= 2) {
            return n;
        }
        return recursive(n - 1) + recursive(n - 2);
    }

    public static int iterative(int n) {
        if (n <= 1) {
            return n;
        }
        
        int prev1 = 1, prev2 = 1;
        int current = 1;
        
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position: ");
        int n = scanner.nextInt();

        int recursiveResult = recursive(n);
        System.out.println(" (Recursive): " + recursiveResult);

        int iterativeResult = iterative(n);
        System.out.println(" (Iterative): " + iterativeResult);

        scanner.close();
    }
}
