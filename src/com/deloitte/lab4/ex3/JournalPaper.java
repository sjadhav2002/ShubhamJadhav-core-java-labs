package com.deloitte.lab4.ex3;

public class JournalPaper extends WrittenItem {
	private int yearPublished;
	
	public JournalPaper(int id, String title, int numCopies, String author, int yearPublished) {
        super(id, title, numCopies, author);
        this.yearPublished = yearPublished;
    }
	public JournalPaper() {
		super();
		this.yearPublished = 0000;
	}
	
	@Override
    public void print() {
        System.out.println("Paper [ID=" + getId() + ", Title=" + getTitle() + ", Author=" + this.getAuthor() +", Year Published="+this.yearPublished+ ", Copies=" + getNumCopies() + "]");
    }
	
	@Override
    public String toString() {
        return super.toString() + ", Year Published=" + this.yearPublished+", Author=" + this.getAuthor();
    }

}
