package com.company.Question_4;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        1. Create a new method to take user input of a number between 1 and 100
        2. Create an if statement that will take this number and if the number is between 1 and/or equal to 45 display,
        "You have been teleported to a swamp".  If the number is between 46 and/or 90 display, "Lucky you, you've been
        teleported to the beach".  If the number is between 91 and/or equal to 100 display, "Well, I hope you like it hot,
        you have been teleported to a volcano."
         */

        Main main = new Main();
        main.teleport(userNum());
    }

    private static int userNum() {

        System.out.println("enter a number between 1 and 100");
        Scanner input = new Scanner(System.in);

        int userNum = -1;
        try {
            userNum = input.nextInt();
        } catch (Exception e) {

        }

        if (userNum > 100 || userNum <=0) {
            System.out.println("Your number is out of bounds, please enter a number between 1 and 100");
            userNum = userNum();
        }

        return userNum;
    }

    private void teleport(int userNum) {
        if (userNum >= 1 && userNum <= 45) {
            System.out.println("You have been teleported to a swamp.");
        } else if (userNum >= 46 && userNum <= 90) {
            System.out.println("Luckily you have been teleported to the beach");
        } else {
            System.out.println("Well, I hope you like it hot, You have been teleported to a volcano");
        }
    }

}
