package org.example;

import java.util.Scanner;

public class LibraryController {

    private Library library;
    private Scanner in = null;

    public LibraryController() {
        this.library = new Library();
    }

    public void showMainMenu(){

        System.out.println("Welcome to Virtual Library! \n");
        System.out.println("1. Accounts" +
                "\n2. Books");
    }

    public void show_members_menu(){
        System.out.println("\n\n Member Menu");
        System.out.println("1. Show Members" +
                "\n2. Register Member");
    }

    public void show_books_menu(){
        System.out.println("1. Show Books" +
                "\n2. Borrow Books");
    }

    public void action_main_menu(int userAction){
            switch (userAction){
                case 1:
                    this.show_members_menu();
                    userAction = this.get_userAction();
                    this.action_members_menu(userAction);
                    break;
                case 2:
                    this.show_books_menu();
                    break;
                default:
                    System.out.println("Invalid input. Try Again");
            }

    }

    public void action_members_menu(int userAction){
        switch (userAction){
            case 1:
                library.display_members();
                break;
            case 2:
                String[] info = library.get_info_member();
                library.register_member(info[0],info[1]);
                break;
            default:
                System.out.println("Invalid input. Try Again");
        }

    }

    public int get_userAction(){
        int userAction;
        try {
            in = new Scanner(System.in);
            userAction = in.nextInt();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return  userAction;
    }

}
