package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Member {
    private String name;
    private String id;
    private ArrayList<Book> borrowed_books;

    public Member(){
        this.borrowed_books = new ArrayList<>();
    }

    public Member(String name) {
        this.name = name;
        this.borrowed_books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    //working
    public void borrow_book(Book book){
        this.borrowed_books.add(book);
    }

    //working
    public void return_book(Book book){
        this.borrowed_books.remove(book);
    }

    //working
    public void display_borrowed_books(){

        Iterator<Book> iterator_borrowed_books = borrowed_books.iterator();

        while(iterator_borrowed_books.hasNext()){
            Book book = iterator_borrowed_books.next();
            System.out.println(book.getTitle());
        }

    }
}
