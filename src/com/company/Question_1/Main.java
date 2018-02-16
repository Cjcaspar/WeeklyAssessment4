package com.company.Question_1;
import java.util.ArrayList;
import java.util.List;

public class Main {

   /*
    YOUR NAME HERE! - No really put your name here so we know who this belongs to when we grade it <3

    Conner Caspar
     */

    public static void main(String[] args) {
         /*
        1. In this class initialize a List as an ArrayList.
        2. Create a method called addToArrayList to add 6 values of your choosing to this ArrayList.
        3. Create a new method in this class called displayArray.
        4. Have this new method use a ForEach loop to iterate through the ArrayList and display each item to the user.
         */

        List<String> library = new ArrayList<>();
        addToArrayList(library);
        displayArray(library);


    }

    public static void addToArrayList(List<String> library) {

        library.add("Call of Duty");
        library.add("PuBG");
        library.add("Hearthstone");
        library.add("League of Legends");
        library.add("WoW");
        library.add("CSGO");
    }

    public static void displayArray(List<String> library) {
        for (String game : library) {
            System.out.println(game);
        }
    }
}
