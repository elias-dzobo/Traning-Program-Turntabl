package Persona;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("The system has chosen a secret number between 0 and 100..");
        Random rand = new Random();
        //int guessLimit = 10;
        int randomNum = rand.nextInt(100);

        Set<Integer> uniqueGuess = new HashSet<Integer>();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Guess the number!");
        int guess = myObj.nextInt();
        uniqueGuess.add(guess);
        while (guess != randomNum) {
            //guessLimit --;

            if (guess > randomNum) {
                System.out.println("Guess is too big!");
                //System.out.println("You have " + guessLimit + " guesses left");
            } else {
                System.out.println("Guess is smaller than secret guess!");
                //System.out.println("You have " + guessLimit + " guesses left");
            }

            guess = myObj.nextInt();
            uniqueGuess.add(guess);
        }

        System.out.println("Yayy!! you got it, it took you " + uniqueGuess.size() + " tries");

    }

}