package main;

import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        // 1. What happens when you run the following code? Why is Arrays.toString necessary?
        // It only prints out the memory address the array is stored in. ??
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        Person jimi = new Person("Jimi Hendrix");
        Person mitch = new Person("Mitch Mitchell");
        Person noel = new Person("Noel Redding");
        String[] people = {jimi.getName(), mitch.getName(), noel.getName()};

        for (String person : people) {
            System.out.println(person);
        }

        addPerson(people, "Ted Nugent");

    }

    public static String[] addPerson(String[] peeps, String peep) {

        System.out.println(Arrays.toString(peeps));
        peeps = Arrays.copyOf(peeps, peeps.length + 1);
        peeps[peeps.length - 1] = peep;
        System.out.println(Arrays.toString(peeps));

        return peeps;
    }


}
