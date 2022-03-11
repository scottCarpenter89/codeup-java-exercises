package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student scott = new Student("Scott", new ArrayList<>());
scott.addGrade(95);
scott.addGrade(82);
scott.addGrade(100);
scott.addGrade(87);
        System.out.println(scott.getGradeAverage());
    }
}
