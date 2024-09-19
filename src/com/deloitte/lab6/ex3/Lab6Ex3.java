package com.deloitte.lab6.ex3;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {
    
	public static Map<Integer, Integer> getSquares(int[] c){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int temp : c) {
				map.put(temp, temp*temp);
		}
		return map;
		
	}
	
	
    public static void main(String[] args) {
        int[] c = {1,2,3,4,5,6,7};
        Map<Integer, Integer> map = getSquares(c);
        System.out.println(map.toString());
        
    }
}
