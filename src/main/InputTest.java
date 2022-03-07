package main;

import util.Input;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input test = new Input(new Scanner(System.in));

        test.getString("Type anything:");
        test.yesNo("Type y or n.");
        test.getInt(0, 100, "Please input a number between 0 and 100: ");
        test.getInt("Please type in any number:");
        test.getDouble(0.00, 1000.00, "Please enter a number with two floating decimals between 0.00 and 1000.00");
        test.getDouble("Please enter a number with two floating decimals");

    }


}
