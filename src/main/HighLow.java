package main;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Do play a number guessing game! (y/n)");
        String playGame = sc.nextLine();
        randomNumber(sc, playGame);

    }
    public static void randomNumber(Scanner sc, String userPlaying) {
        if (userPlaying.equalsIgnoreCase("y")) {
            int randomNumber = (int) (Math.random() * 100) + 1;
           highLowGame(10, randomNumber, sc);
        } else {
            System.out.println("Maybe some other time then.");
            return;
        }

    }


    public static void highLowGame(int attempts, int randomNumber, Scanner sc) {
//        int attemptsLeft = attempts;
        System.out.println("Guess any number between 1 and 100.");
        int userGuess = sc.nextInt();
//        System.out.println("Test. The random number is: " + randomNumber);
        if (userGuess < 1 || userGuess > 100) {
            System.out.println("That number is out of range, please try again");
            return;
        }

        if (attempts == 0) {
            System.out.printf("Sorry, you're out of tries. The number was %d. Try again.", randomNumber);
            return;
        }

        if (userGuess > randomNumber) {
            System.out.println("LOWER. Guess again.");
            highLowGame(attempts - 1, randomNumber, sc);
        } else if (userGuess < randomNumber) {
            System.out.println("HIGHER. Guess again.");
            highLowGame(attempts - 1, randomNumber, sc);
        } else {
            System.out.printf("YOU GUESSED IT! Then number was %d! \nWould you like to play again? (y/n)\n", randomNumber);
            String playAgain = sc.next();
            if (playAgain.equalsIgnoreCase("y")) {
                highLowGame(attempts, randomNumber, sc);
            } else {
                return;
            }
        }

    }
}
