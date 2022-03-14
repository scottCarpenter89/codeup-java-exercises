package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

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
//        System.out.println(grades);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        long total = 0;
        double average;
        for(int grade : grades) {
            total += grade;
        }
//        System.out.println(total);
//        System.out.println(grades.size());
        average = total / grades.size();
        return average;
    }

    public static void main(String[] args) {



    }


}
