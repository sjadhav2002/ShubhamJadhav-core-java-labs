package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Lab6Ex4 {
    
	public static Map<Integer, String> getStudents(Map<Integer, Integer> marks){
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(Map.Entry<Integer, Integer> entry : marks.entrySet()) {
				int val = entry.getValue();
				int key = entry.getKey();
				String medal = "";
				if(val>=90) { medal = "Gold";map.put(key, medal);} 
				else if(val>= 80) {  medal = "Silver" ;map.put(key, medal);}
				else if(val>= 70) {  medal = "Bronze";map.put(key, medal);}
		}
		return map;
		
	}
	
    public static void main(String[] args) {
    	Map<Integer, Integer> marks = new HashMap<Integer, Integer>();
    	marks.put(10001, 60);
    	marks.put(10002, 70);
    	marks.put(10003, 80);
    	marks.put(10004, 90);
    	marks.put(10005, 100);
    	
    	System.out.println(getStudents(marks).toString());
    	
    }
}
