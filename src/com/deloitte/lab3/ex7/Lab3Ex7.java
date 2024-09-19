package com.deloitte.lab3.ex7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class Lab3Ex7 {
    
	public static int getDiffernce(LocalDate parsedDate, LocalDate currentDate, String type) {
		if(type == "Days") {
			Long difference = ChronoUnit.DAYS.between(parsedDate, currentDate);
			return difference.intValue();
		}
		else if (type == "Months") {
			Long difference = ChronoUnit.MONTHS.between(parsedDate, currentDate);
			return difference.intValue();
		}
		else {
			Long difference = ChronoUnit.YEARS.between(parsedDate, currentDate);
			return difference.intValue();
		}
		
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date: ");
		String n = sc.nextLine();
		
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate parsedDate = LocalDate.parse(n, sdf);
		LocalDate currentDate = LocalDate.now();
		
		int days = getDiffernce(parsedDate, currentDate, "Days");
		int months = getDiffernce(parsedDate, currentDate, "Months");
		int years = getDiffernce(parsedDate, currentDate, "Years");
		
		System.out.println("Days: "+days+" Months: "+months+" Years: "+ years);
        
        
        
        
        sc.close();
    }
}
