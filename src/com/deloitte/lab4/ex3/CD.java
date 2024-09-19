package com.deloitte.lab4.ex3;

public class CD extends MediaItem {
    private String artist; 
    private String genre; 


    public CD(int id, String title, int numCopies, int runtime, String artist, String genre) {
        super(id, title, numCopies, runtime); 
        this.artist = artist;
        this.genre = genre;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public void print() {
        System.out.println("CD [ID=" + getId() + ", Title=" + getTitle() + ", Artist=" + artist + ", Genre=" + genre +
                ", Runtime=" + getRuntime() + " minutes, Copies=" + getNumCopies() + "]");
    }


    @Override
    public String toString() {
        return super.toString() + ", Artist=" + artist + ", Genre=" + genre;
    }
}
