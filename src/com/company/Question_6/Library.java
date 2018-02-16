package com.company.Question_6;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Game> gameLibrary = new ArrayList<Game>();



    protected void addGame(Game game) {
        //Code goes here to add game to where ever we are saving game things to
        gameLibrary.add(game);
    }


    protected void removeGame(int gameIndex) {
        if (gameLibrary.isEmpty()) {
            System.out.println("There are no games to remove from the Library at this time.");
        } else {
            gameIndex -= gameIndex;
            gameLibrary.remove(gameIndex);
            System.out.println("This game has been removed from your library.");
        }
    }

    protected void listGames() {

        System.out.println("\n");
        if (gameLibrary.isEmpty()) {
            System.out.println("There are no games in your Library.");
        } else {
            int index = 1;
            for (Game game : gameLibrary) {
                System.out.println(index++ + ". " + game.getTitle());
            }
        }
        System.out.println("\n");
    }
}
