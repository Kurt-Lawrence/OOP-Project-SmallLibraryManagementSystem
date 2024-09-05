package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibraryController libController = new LibraryController();
        Scanner in = null;

        boolean run = true;

        while(run){
            libController.showMainMenu();

            int userAction = libController.get_userAction();
            libController.action_main_menu(userAction);

            System.out.println("\n");

        }

    }

}