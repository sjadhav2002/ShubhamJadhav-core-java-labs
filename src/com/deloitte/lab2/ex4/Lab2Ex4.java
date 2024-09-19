package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

public class Lab2Ex4 {

	public static Integer[] modifyArray(int[] arr) {
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }
        Integer[] resultArray = set.toArray(new Integer[0]);
        return resultArray;
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 1, 4, 2, 5, 3, 2, 6, 5, 7};
        Integer[] resultArray = modifyArray(inputArray);
        System.out.println(Arrays.toString(resultArray));
    }
}
