package com.company.Question_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private Library library = new Library();

    protected void startMenu() {

        System.out.println("Welcome to the Video Game Library, what would you like to do?  \n" +
                "1. Add a game to the Library \n" +
                "2. Remove a game from the Library \n" +
                "3. View what is currently in the Library \n" +
                "4. Exit the program");

        try {
            switch (input.nextInt()) {
                case 1:
                    //Add a game
                    System.out.println("You have chosen to add a game. \n" +
                            "What is the title of this game?");
                    input.nextLine();
                    Game game = new Game(input.nextLine());
                    System.out.println("You have added " + game.getTitle() + " to your library, this game can now be checked out.");
                    library.addGame(game);
                    startMenu();
                    break;
                case 2:
                    //Remove game
                    input.nextLine();
                    System.out.println("You have chosen to remove a game from your library. \n" +
                            "Here is a list of games, type the number of the one you would like to remove.");
                    //Create method to list all game available in the library that can be removed
                    library.listGames();
                    library.removeGame(input.nextInt());
                    startMenu();
                    break;
                case 3:
                    //View Library
                    library.listGames();
                    startMenu();
                    break;
                case 4:
                    //Exit program
                    System.exit(0);
                    break;
                default:
                    //prompt user to pick a correct number, loop back to menu
                    System.out.println("Please pick a number between 1 and 4");
                    startMenu();
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Select a number from 1 - 7");
            startMenu();
        }
    }
}
