package org.example;

public class LibraryController {

    private Library library;

    public LibraryController(Library library) {
        this.library = new Library();
    }

    private void showMainMenu(){
        System.out.println("1. Accounts" +
                "\n2. Books");
    }

    private void showAccountsMenu(){
        System.out.println("1. Show Books" +
                "");
    }

}
