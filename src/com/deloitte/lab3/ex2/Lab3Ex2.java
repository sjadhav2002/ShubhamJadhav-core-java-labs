package com.deloitte.lab3.ex2;

import java.util.Scanner;

public class Lab3Ex2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        
        System.out.println(str+"|"+rev);
        
        
        sc.close();
        
    }
}
