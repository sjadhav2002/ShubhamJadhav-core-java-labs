package com.deloitte.lab4.ex3;



public class Lab4Ex3 {
    
    public static void main(String[] args) {
    	
    	Book book = new Book(101, "Effective Java", 5, "Joshua Bloch");
        book.print();
        book.checkOut();
        book.print();

        // Create a Journal instance
        JournalPaper journal = new JournalPaper(202, "IEEE Transactions on Computers", 3, "Shubham", 2024);
        journal.print();
        journal.checkIn();
        journal.print();
    	
    	
    	Video video = new Video(101, "V1", 3, 148, "Video1", "Fiction", 2010);
        video.print();
        video.checkOut();
        video.print(); 

        // Create a CD instance
        CD cd = new CD(102, "Thriller", 5, 42, "Michael Jackson", "Pop");
        cd.print();
        cd.checkIn();
        cd.print();
    }
}
