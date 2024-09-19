package com.deloitte.lab1.ex4;

import java.util.Scanner;

public class Lab1Ex4 {

	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		for(int i = 0;i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
