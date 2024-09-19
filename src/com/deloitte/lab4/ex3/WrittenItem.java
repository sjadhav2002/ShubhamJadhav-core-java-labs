package com.deloitte.lab4.ex3;

public abstract class WrittenItem extends Item {

	private String author;
	
	public WrittenItem(int id, String title, int numCopies, String author) {
        super(id, title, numCopies);
        this.author = author;
    }
	public WrittenItem() {
        super();
        this.author = "Unknown Author";
    }
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
