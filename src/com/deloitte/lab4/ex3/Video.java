package com.deloitte.lab4.ex3;

public class Video extends MediaItem {
    private String director;  
    private String genre;   
    private int yearReleased; 


    public Video(int id, String title, int numCopies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, numCopies, runtime); 
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }


    @Override
    public void print() {
        System.out.println("Video [ID=" + getId() + ", Title=" + getTitle() + ", Director=" + director + ", Genre=" + genre +
                ", Year Released=" + yearReleased + ", Runtime=" + getRuntime() + " minutes, Copies=" + getNumCopies() + "]");
    }


    @Override
    public String toString() {
        return super.toString() + ", Director=" + director + ", Genre=" + genre + ", Year Released=" + yearReleased;
    }
}

