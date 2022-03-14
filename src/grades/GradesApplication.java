package grades;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import grades.Student;

public class GradesApplication {

    private static final Scanner userInput = new Scanner(System.in);

    private static void printUsernames(HashMap<String, Object> students) {

        System.out.println("Here are a list of usernames of our students:\n");
        for (String student : students.keySet()) {
            System.out.printf("| %s |", student);
        }
    }

    private static String selectUser() {
        System.out.println("\n\n");
        System.out.println("What student would you like to see more information on?");
        return userInput.nextLine();
    }

//    private static void selectStudent(HashMap<String, Object> student) {
//       Boolean userContinues = true;
//        do {
//            if (student.containsKey(selectUser().equals("tie-lur"))) {
//                System.out.printf("Name: %s - GitHub username: %s\nCurrent Average: %s", jacob.getName(),);
//            }
//        } while (userContinues);
//
//    }

    public static void main(String[] args) {

        Student jacob = new Student("Jacob", new ArrayList<>());
        jacob.addGrade(78);
        jacob.addGrade(93);
        jacob.addGrade(97);
        System.out.println(jacob.getGradeAverage());

        Student jane = new Student("Jane", new ArrayList<>());
        jane.addGrade(84);
        jane.addGrade(90);
        jane.addGrade(75);
        System.out.println(jane.getGradeAverage());

        Student tony = new Student("Tony", new ArrayList<>());
        tony.addGrade(4);
        tony.addGrade(23);
        tony.addGrade(10);
        System.out.println(tony.getGradeAverage());

        Student scott = new Student("Scott", new ArrayList<>());
        scott.addGrade(95);
        scott.addGrade(82);
        scott.addGrade(100);
        scott.addGrade(87);
        System.out.println(scott.getGradeAverage());

        HashMap<String, Object> students = new HashMap<>();
        students.put("tone-knee", tony);
        students.put("janie\'s-got-a", jane);
        students.put("jac-o-byte", jacob);
        students.put("scottie-doesn\'t", scott);

        System.out.println(students.get("tone-knee"));
        printUsernames(students);
//        selectUser();
    }


}