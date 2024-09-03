package org.example;

public class Book {

    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    //working
    public String getTitle() {
        return title;
    }

    //working
    public void displayInfo(){

        System.out.println("Book Information");
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }


    //working
    public void borrow(){
        this.isAvailable = false;
    }


    //working
    public void return_book(){
        this.isAvailable = true;

    }

}
