package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input(new Scanner(System.in));
        boolean continueCircleLoop = true;
do {
    double radius = userInput.getDouble("Please type in the radius of the circle.");
    Circle circle1 = new Circle(radius);
    double area = circle1.getArea(radius);
    System.out.printf("The area of the circle is: %.2f\n", area);
    double circumference = circle1.getCircumference(radius);
    System.out.printf("The circumference of the circle is: %.2f\n", circumference);

    boolean doAnother = userInput.yesNo("Do you want calculate for another circle?");
    if (!doAnother) {
       continueCircleLoop = false;
    }
} while (continueCircleLoop);

    }

}
