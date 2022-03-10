package movies;

import java.util.Scanner;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
Input sc = new Input();
        System.out.println("We have a lot of movies to pick from. You can view all of them or view by category.\nWhat would you like to do?\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category");
        String userChoice = sc.getInt();
        System.out.println(userChoice);

    }
}
