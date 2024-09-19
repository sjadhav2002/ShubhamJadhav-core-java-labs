package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex1 {
    
	public static List<Integer> getValues(HashMap<String, Integer> map) {
        List<Integer> valuesList = new ArrayList<>(map.values());
        Collections.sort(valuesList);
        return valuesList;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 25);
        map.put("B", 10);
        map.put("C", 30);
        map.put("D", 5);

        List<Integer> sortedValues = getValues(map);

        System.out.println("Sorted values: " + sortedValues);
    }
}
