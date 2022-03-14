package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    private final String name;
    private final ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }
    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        double average;
        for(int grade : grades) {
            total += grade;
        }
        average = total / grades.size();
        return average;
    }

    public static void main(String[] args) {



//        Student jacob = new Student("Jacob", new ArrayList<>());
//        jacob.addGrade(78);
//        jacob.addGrade(93);
//        jacob.addGrade(97);
//        System.out.println(jacob.getGradeAverage());
//
//        Student jane = new Student("Jane", new ArrayList<>());
//        jane.addGrade(84);
//        jane.addGrade(90);
//        jane.addGrade(75);
//        System.out.println(jane.getGradeAverage());
//
//        Student tony = new Student("Tony", new ArrayList<>());
//        tony.addGrade(4);
//        tony.addGrade(23);
//        tony.addGrade(10);
//        System.out.println(tony.getGradeAverage());
//
//        Student scott = new Student("Scott", new ArrayList<>());
//        scott.addGrade(95);
//        scott.addGrade(82);
//        scott.addGrade(100);
//        scott.addGrade(87);
//        System.out.println(scott.getGradeAverage());



    }


}
