package grades;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {

    private static final Scanner userInput = new Scanner(System.in);

    private static void printUsernames(HashMap<String, Object> students) {

        System.out.println("Here are a list of usernames of our students:\n");
        for (String student : students.keySet()) {
            System.out.printf("| %s |\n\n", student);
        }
    }

    private static String selectUser() {

        System.out.println("What student would you like to see more information on?");
        return userInput.nextLine();
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

        Student tyler = new Student("Tyler", new ArrayList<>());
        tyler.addGrade(4);
        tyler.addGrade(23);
        tyler.addGrade(10);

        Student scott = new Student("Scott", new ArrayList<>());
        scott.addGrade(95);
        scott.addGrade(82);
        scott.addGrade(100);
        scott.addGrade(87);

        HashMap<String, Object> students = new HashMap<>();
        students.put("tie-lur", tyler.getGradeAverage());
        students.put("janie\'s-got-a", jane.getGradeAverage());
        students.put("jac-obyte", jacob.getGradeAverage());
        students.put("scottie-doesn\'t", scott.getGradeAverage());

        printUsernames(students);
        selectUser();
    }


}