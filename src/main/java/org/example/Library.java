package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private Scanner in = null;
    private int idCount = 5;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();

        members.add(new Member("John","1"));
        members.add(new Member("Alice","2"));
        members.add(new Member("Bob","3"));
        members.add(new Member("Sarah","4"));
        members.add(new Member("Mike","5"));
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
    public void register_member(String name, String id){
        Member member = new Member(name,id);
        this.members.add(member);
    }

    //working
    public void display_members(){
        Iterator<Member> iterator_member = members.iterator();

        System.out.println("\n-------------------\nMembers");

        while(iterator_member.hasNext()){
            Member member = iterator_member.next();
            System.out.println(member.getId() +". "+ member.getName());
        }
        System.out.println("-------------------\n");
    }


    public void find_book_by_title(){
        //TODO: return book by title
    }

    public String[] get_info_member(){
        String[] info = new String[2];


        try {
            in = new Scanner(System.in);

            System.out.println("Enter Name: ");
            info[0] = in.nextLine();

            info[1] = String.valueOf(idCount+=1);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return info;
    }


}
