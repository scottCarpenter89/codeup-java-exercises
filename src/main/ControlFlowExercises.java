package main;

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
        int count = 1;
        do {
            if (count % 3 == 0 || count % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(count);
            }
            count += 1;
        } while (count <= 100);



    }
}
