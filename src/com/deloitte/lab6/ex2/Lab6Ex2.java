package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {
    
	public static Map<Character, Integer> countChars(char[] c){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char temp : c) {
			if(map.containsKey(temp)) {
				int val = map.get(temp);
				map.put(temp, val+1);
			}
			else {
				map.put(temp, 1);
			}
			
		}
		return map;
		
	}
	
	
    public static void main(String[] args) {
        char[] c = {'a','b','c','d','a','a','a','b','b','c'};
        Map<Character, Integer> map = countChars(c);
        System.out.println(map.toString());
        
    }
}
