package com.deloitte.lab4.ex3;


public abstract class Item {
    private int id;
    private String title;
    private int numCopies;


    public Item(int id, String title, int numCopies) {
        this.id = id;
        this.title = title;
        this.numCopies = numCopies;
    }


    public Item() {
        this.id = 0;
        this.title = "Unknown";
        this.numCopies = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }


    public void addItem(int num) {
        this.numCopies += num;
    }


    public void checkIn() {
        this.numCopies++;
    }


    public void checkOut() {
        if (numCopies > 0) {
            this.numCopies--;
        } else {
            System.out.println("No copies available to check out.");
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Item item = (Item) obj;
        return id == item.id &&
                numCopies == item.numCopies &&
                title.equals(item.title);
    }


    @Override
    public String toString() {
        return "Item [ID=" + id + ", Title=" + title + ", Copies=" + numCopies + "]";
    }

    // Abstract method for printing item details (must be implemented by subclasses)
    public abstract void print();
}

