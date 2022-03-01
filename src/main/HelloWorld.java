package main;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//
//        int myFavoriteNumber = 22;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "My wife and I were both born on day 22 of our respective months";
//        System.out.println(myString);

        // q3-4 java won't let you reassign a variable once it is defined
//        char myString = 3.14159 ;

        // q5 java cannot compile because myNumber was not initialized/set to anything yet

        /*       long myNumber;
         System.out.println(myNumber); */

        // q6 java is detecting that the data type is double and not a long
//        long myNumber = 3.14;

        // q7 it seems to accept the numbers and character, but ignores that character
//        long myNumber = 123L;
//        System.out.println(myNumber);

        // q8 long is a data type the accepts integers and not floating decimal point numbers
//        long myNumber = 123;
//        System.out.println(myNumber);

        // q9 it gives the message: java: incompatible types: possible lossy conversion from double to float.
        // We could convert the data type to a double or add an f at the end of the number
//        float myNumber = 3.14f;
//        System.out.println(myNumber);

        // q10 the first one prints 5 then 6, the next prints 6, then 6.
        // The difference is where the unary incrementer is placed (pre- or -post operand)
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // q11 it highlights. Class is a reserved word, but more importantly, there should not be more than one class per java file
//        class something

        // q12 the compiler says that the string can't be cast into an integer.
        // the second error in the second statement says the data types are incompatible, but for the same reason: they cannot be converted
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        // q13
//        int x = 4;
//        x = x + 5;
        //shorthand
//        int x = 4 + 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;
        //shorthand
//        int x = 3;
//        int y = 4 * x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
        //shorthand
//        int x = 10;
//        int y = 2;
//        int z = y - x / y;
//        System.out.println(z);

//        q14 first part will return an error stating there is a possible lossy conversion from int to byte
          // the second part will that increments past the boundaries will loop to back to the opposite extreme of the datatype

//        byte number = 128;
//        System.out.println(number);
//        byte number2 = 127;
//        number2++;
//        System.out.println(number2);
    }
}
