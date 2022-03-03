package main;

import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
//        Create a class named Bob with a main method for the following exercise.
//          Bob is a lackadaisical teenager. In conversation, his responses are very limited.
        //        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        //        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        //        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        //        He answers 'Whatever.' to anything else.

        Scanner talkToBob = new Scanner(System.in);
        String userInput = talkToBob.nextLine();
//        System.out.println(userInput);

        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
