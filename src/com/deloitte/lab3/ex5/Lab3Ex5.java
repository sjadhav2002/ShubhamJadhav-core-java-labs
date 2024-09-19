package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class Lab3Ex5 {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter Text. End with an empty line:");

        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            sb.append(line);
            sb.append("\n");
        }
        
        Integer chars = sb.length();
        
        System.out.println("Character Count: "+chars.toString());

        int count = 0;
        int index = 0;
        while ((index = sb.indexOf("\n", index)) != -1) {
            count++;
            index += "\n".length();
        }
        
        System.out.println("Line Count: "+ count);
        
        int wordCount = sb.toString().split("[ \\n]").length;
        System.out.println("Word Count: "+ wordCount);
        
        
    }
}
