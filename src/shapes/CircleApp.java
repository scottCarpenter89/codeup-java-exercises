package shapes;
import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input userInput = new Input(new Scanner(System.in));

        double radius = userInput.getDouble("Please type in the radius of the circle.");
        Circle circle1 = new Circle(radius);


        System.out.println( circle1.getArea(radius));

        System.out.println(circle1.getCircumference(radius));
    }

}
