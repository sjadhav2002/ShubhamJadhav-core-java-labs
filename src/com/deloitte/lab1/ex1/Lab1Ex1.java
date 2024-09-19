package com.deloitte.lab1.ex1;

public class Lab1Ex1 {

    public static void main(String[] args) {
        int number = 123;  // Example number
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        System.out.println("Sum of the cubes: " + sum);
    }
}
