package main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

//        1. Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
//              What happens if you input something that is not an integer?
                    // it gives you an input mismatch exception
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num1 = scanner.nextInt();
        System.out.println("Here is your number: " + num1);

//        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//                What happens if you enter less than 3 words?
//                      --won't print the last word
//                What happens if you enter more than 3 words?
//                      --the program won't run correctly??
        System.out.println("Type three words.");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("First word: " + word1 + "\nSecond word: " + word2 + "\nThird word: " + word3);
        scanner.nextLine();
//        Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//              do you capture all the words?
//                  -- no, only the first word is captured
        System.out.println("Enter a sentence.");
        String userInput = scanner.nextLine();
        System.out.println(userInput);

//        Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//              1. Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings                    to a numeric type.
//                      Assume that the rooms are perfect rectangles.
//                      Assume that the user will enter valid numeric data for length and width.
//              2. Display the area and perimeter of that classroom.
//                      The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
        System.out.println("Enter the length of the room you are in.");
        String roomLength = scanner.nextLine();
        int length = Integer.parseInt(roomLength);
        System.out.println("Enter the width of the room you are in.");
        String roomWidth = scanner.nextLine();
        int width = Integer.parseInt(roomWidth);
        int perimeter = 2 * length + 2 * width;
        System.out.println("The perimeter of the room is: " + perimeter + " feet");
        scanner.close();
    }
}
