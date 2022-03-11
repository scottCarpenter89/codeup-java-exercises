package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String input = scanner.nextLine();
        System.out.println("The number input from the user was: " + input);
        return input;
    }

    public Boolean yesNo(String prompt) {
        System.out.println(prompt);
        String yN = scanner.next();
        if (yN.equalsIgnoreCase("y")) {
//            System.out.printf("You typed %s. Returning true.", yN);
            return true;
        }
//        System.out.printf("You typed %s. Returning false.", yN);
        return false;
    }

    public int getInt(int min, int max, String prompt) {
        System.out.println(prompt);
//        System.out.println("Please input a number between " + min + "and " + max);
        int input = scanner.nextInt();
        if (input < min || input > max) {
            System.out.println("Try another number between " + min + " and " + max);
            getInt(min, max, prompt);
        }
        return input;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int getNum = scanner.nextInt();
        System.out.printf("Here is the input number from the user: %s", getNum);
        return getNum;
    }


    public double getDouble(double min, double max, String prompt) {
        System.out.println(prompt);
        double inputNum = scanner.nextDouble();
        if (inputNum > min && inputNum < max) {
            System.out.println("Your input is valid.");
        } else {
            System.out.println("Try another number between " + min + "and " + max);
            return getDouble(min, max, prompt);
        }
        return inputNum;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double inputNum = scanner.nextDouble();
//        System.out.printf("Here was the number input from the user: %s", inputNum);
        return inputNum;
    }


}
