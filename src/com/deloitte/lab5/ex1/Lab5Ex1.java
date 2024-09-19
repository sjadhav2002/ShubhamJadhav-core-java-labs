package com.deloitte.lab5.ex1;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Lab5Ex1 {
    
	public static void validateAge(int age) throws InvalidAgeException {
        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15.");
        }
    }

    public static void main(String[] args) {
        int personAge = 12;

        try {
            validateAge(personAge);
            System.out.println("Valid age: " + personAge);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}
