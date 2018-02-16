package com.company.Question_5;
import java.util.*;

public class Main {

    public static void main(String[] args) {
         /*
         1. Create a new method in this class.  Make sure to instantiate the main to break out of the static context.
         2. Create a switch statement in this new method that has 4 cases and a default.  This switch should take user input of a string .
         3. Make sure you prompt your user as to what they should enter
         4. Have the default case tell the user to input the correct input you are looking for and use recursion to run the switch again.
         */

         Main main = new Main();
         main.color();


    }

    private void color() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite color? Red, Blue Yellow, or other?");

        String color = input.nextLine();

        switch (color) {
            case "Red":
                System.out.println("Red is your favorite color");
                break;
            case "Blue":
                System.out.println("Blue is your favorite color");
                break;
            case "Yellow":
                System.out.println("Yellow is your favorite color");
                break;
            case "Other":
                System.out.println("Your favorite color is not listed here");
                break;
            default:
                System.out.println("Could not read input. Please try again. Remember that capitalization matters.");
                color();
                break;
        }
    }

}
