package com.deloitte.lab4.ex3;

public class Book extends WrittenItem {
	public Book(int id, String title, int numCopies, String author) {
        super(id, title, numCopies, author); // Call the superclass constructor
    }
	
	@Override
    public void print() {
        System.out.println("Book [ID=" + getId() + ", Title=" + getTitle() + ", Author=" + this.getAuthor() + ", Copies=" + getNumCopies() + "]");
    }
	
	@Override
    public String toString() {
        return super.toString() + ", Author=" + this.getAuthor();
    }
}
