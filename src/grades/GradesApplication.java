package grades;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import grades.Student;

import util.Input;

public class GradesApplication {

    private static final Input userInput = new Input();

    private static final HashMap<String, Student> students = new HashMap<>();

    private static void printUsernames() {

        System.out.println("Here are a list of usernames of our students:\n");
        for (String student : students.keySet()) {
            System.out.printf("| %s |", student);
        }
    }

    public static void main(String[] args) {

        Student jacob = new Student("Jacob", new ArrayList<>());
        jacob.addGrade(78);
        jacob.addGrade(93);
        jacob.addGrade(97);

        Student jane = new Student("Jane", new ArrayList<>());
        jane.addGrade(84);
        jane.addGrade(90);
        jane.addGrade(75);

        Student tony = new Student("Tony", new ArrayList<>());
        tony.addGrade(4);
        tony.addGrade(23);
        tony.addGrade(10);

        Student scott = new Student("Scott", new ArrayList<>());
        scott.addGrade(95);
        scott.addGrade(82);
        scott.addGrade(100);
        scott.addGrade(87);

        students.put("tone-knee", tony);
        students.put("janie's-got-a", jane);
        students.put("jac-o-byte", jacob);
        students.put("scottie-doesn't", scott);

        printUsernames();
        doMainLoop();
    }

    private static void doMainLoop() {
        boolean viewClass = userInput.yesNo("\n\nWould you like to view the entire class's grades?");
        if (viewClass) {
            viewClassInfo();
        } else {
            while (true) {
                // prompts user to input a username

                String selectUser = userInput.getString("\n\nWhat student would you like to see more information on?");
                // print user
                printUser(selectUser);


                // ask the user to continue
                // if no
                if (!userInput.yesNo("\n\nDo you want to search for another user?")) {
                    // then break
                    break;
                }
            }
        }
    }

    private static void viewClassInfo() {

        for(String student : students.keySet()) {
            System.out.printf("%s,\n", student);
        }
    }

    private static void printUser(String selectUser) {
        // verify if the user is in the hashmap
        if (students.containsKey(selectUser)) {
            // get user from the hashmap and print
            Student student = students.get(selectUser);
            System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %.1f", student.getName(), selectUser, student.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".", selectUser);
        }
    }

}