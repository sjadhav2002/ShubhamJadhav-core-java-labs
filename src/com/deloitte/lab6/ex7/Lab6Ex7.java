package com.deloitte.lab6.ex7;

import java.util.Arrays;

public class Lab6Ex7 {
    
	public static int[] getSorted(int[] arr) {
		int[] reversedNumbers = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
            String str = String.valueOf(arr[i]);
            String reversed = new StringBuilder(str).reverse().toString();
            reversedNumbers[i] = Integer.parseInt(reversed);
        }
		
		Arrays.sort(reversedNumbers);

        return reversedNumbers;
    }

    public static void main(String[] args) {
        int[] inputArray = {53, 32, 86, 61, 20, 73};
        int[] resultArray = getSorted(inputArray);
        System.out.println("Sorted: "+Arrays.toString(resultArray));
    }

}
