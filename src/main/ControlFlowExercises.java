package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        1. Loop Basics
//            a. While
        //        Create an integer variable i with a value of 5.
        //        Create a while loop that runs so long as i is less than or equal to 15
        //        Each loop iteration, output the current value of i, then increment i by one.
        //        Your output should look like this:
//                5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();

//        b. Do While
//            Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int count = 0;
//        do {
//            System.out.println(count);
//        count += 2;
//
//        } while (count <= 100);
//            Alter your loop to count backwards by 5's from 100 to -10.
//        int count = 100;
//        do {
//            System.out.println(count);
//            count -= 5;
//
//        } while (count >= -10);
//            Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //        2
        //        4
        //        16
        //        256
        //        65536
//        long count = 2;
//        do {
//            System.out.println(count);
//            count = count * count;
//        } while (count < 1000000);

//        c. For
//        Refactor the previous two exercises to use a for loop instead.
//
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//            i++;
//        }
//
//        for (int i = 0; i <= 100; i+=5) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10 ; i-=5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }

//        2. Fizzbuzz
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//                Write a program that prints the numbers from 1 to 100.
//                int count = 1;
//                do {
//                    System.out.println(count);
//                    count += 1;
//                } while (count <= 100);
//                For multiples of three: print “Fizz” instead of the number.
//        int count = 1;
//        do {
//            if (count % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(count);
//            }
//            count += 1;
//        } while (count <= 100);
//                For the multiples of five: print “Buzz”.
//        int count = 1;
//        do {
//            if (count % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(count);
//            }
//            count += 1;
//        } while (count <= 100);
//                For numbers which are multiples of both three and five: print “FizzBuzz”.
//        int count = 1;
//        do {
//            if (count % 3 == 0 || count % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(count);
//            }
//            count += 1;
//        } while (count <= 100);

//        2. Display a table of powers.
//                Prompt the user to enter an integer.
//                Display a table of squares and cubes from 1 to the value entered.
//                Ask if the user wants to continue.
//                Assume that the user will enter valid data.
//                Only continue if the user agrees to.
//                Example Output

        //        What number would you like to go up to? 5
        //
        //        Here is your table!
        //
        //                number | squared | cubed
        //                ------ | ------- | -----
        //                1      | 1       | 1
        //                2      | 4       | 8
        //                3      | 9       | 27
        //                4      | 16      | 64
        //                5      | 25      | 125
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String userInput = scanner.nextLine();
        long parsedUserInput = Integer.parseInt(userInput);

        String numberColumn = "number";
        String squaredColumn = "squared";
        String cubedColumn = "cubed";

        System.out.printf("%s | %s | %s\n", numberColumn, squaredColumn, cubedColumn);
        System.out.println("------ | ------- | -----");

        for (long i = 0; i < 5; i++) {
            long inputSquared = parsedUserInput * parsedUserInput;
            long inputCubed = parsedUserInput * parsedUserInput * parsedUserInput;
            System.out.printf("%-7d| %-8d| %-5d\n", parsedUserInput, inputSquared, inputCubed);
             parsedUserInput += 1;
        }


//        4. Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//                Display the corresponding letter grade.
//                Prompt the user to continue.
//                Assume that the user will enter valid integers for the grades.
//                The application should only continue if the user agrees to.
//                Grade Ranges:
//
//                    A : 100 - 88
//                    B : 87 - 80
//                    C : 79 - 67
//                    D : 66 - 60
//                    F : 59 - 0
//        Bonus
//            Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
        System.out.println("Please enter your hypothetical grade for a letter conversion.");
        String gradeInput = scanner.nextLine();
        int parsedGrade = Integer.parseInt(gradeInput);
        if (parsedGrade < 60) {
            System.out.println("Your letter grade is: F");
        } else if (parsedGrade < 63) {
            System.out.println("Your letter grade is: D-");
        } else if (parsedGrade < 66) {
            System.out.println("Your letter grade is: D");
        } else if (parsedGrade < 70) {
            System.out.println("Your letter grade is: D+");
        } else if (parsedGrade < 73) {
            System.out.println("Your letter grade is: C-");
        } else if (parsedGrade < 76) {
            System.out.println("Your letter grade is: C");
        } else if (parsedGrade < 80) {
            System.out.println("Your letter grade is: C+");
        } else if (parsedGrade < 83) {
            System.out.println("Your letter grade is: B-");
        } else if (parsedGrade < 86) {
            System.out.println("Your letter grade is: B");
        } else if (parsedGrade < 90) {
            System.out.println("Your letter grade is: B+");
        } else if (parsedGrade < 93) {
            System.out.println("Your letter grade is: A-");
        } else if (parsedGrade < 96) {
            System.out.println("Your letter grade is: A");
        } else if (parsedGrade <= 100) {
            System.out.println("Your letter grade is: A+");
        }
        scanner.close();
    }
}
