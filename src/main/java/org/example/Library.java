package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    //working
    public void add_book(Book book){
        this.books.add(book);
    }

    //working
    public void remove_book(Book book){
        this.books.remove(book);
    }

    //working
    public void display_books(){
        Iterator<Book> iterator_book = books.iterator();

        while(iterator_book.hasNext()){
            Book book = iterator_book.next();
            System.out.println(book.getTitle());
        }
    }

    //working
    public void register_member(Member member){
        this.members.add(member);
    }

    //working
    public void display_members(){
        Iterator<Member> iterator_member = members.iterator();

        while(iterator_member.hasNext()){
            Member member = iterator_member.next();
            System.out.println(member.getName());
        }
    }


    public void find_book_by_title(){
        //TODO: return book by title
    }


}
