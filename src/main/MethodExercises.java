package main;


import java.util.Scanner;

public class MethodExercises {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(add(3, 4));
        System.out.println(subtract(12, 3));
        System.out.println(multiply(7, 3));
        System.out.println(divide(25, 5));
        System.out.println();
        int userInput = getInteger(1, 10);
        System.out.println(userInput);
//        System.out.println(factorial(1, 10, sc));

    }


//    1. Basic Arithmetic
//        Create four separate methods. Each will perform an arithmetic operation:
//            Addition
//            Subtraction
//            Multiplication
//            Division
    //    Each function needs to take two parameters/arguments so that the operation can be performed.
    //    Test your methods and verify the output.
    //    Add a modulus method that finds the modulus of two numbers.
    //        Food for thought: What happens if we try to divide by zero? What should happen?

    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    public static long subtract(long num1, long num2) {
        return num1 - num2;
    }

    public static long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public static long divide(long num1, long num2) {
        return num1 / num2;
    }

//    2. Create a method that validates that user input is in a certain range
//        The method signature should look like this:

//            public static int getInteger(int min, int max);
//
//       and is used like this:
//
//            System.out.print("Enter a number between 1 and 10: ");
//            int userInput = getInteger(1, 10);


    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": \n");
        Scanner sc = new Scanner(System.in);
        int userInteger = sc.nextInt();
        if (userInteger < min || userInteger > max) {
            System.out.printf("That is not a valid value between %d and %d\n", min, max);
            return getInteger(min, max);
        }
        return userInteger;
    }


//    public static long factorial(int min, int max, Scanner scanner) {
//        System.out.println("Enter a number from " + min + "to" + max + ".");
//        System.out.println("Calculating a factorial from your number, continue? (y/n");
//        String userAnswer = scanner.nextLine();
//        if (userAnswer.equals("n")) {
//
//        }
//    }


}
