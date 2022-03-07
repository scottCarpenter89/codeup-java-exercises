package shapes;

public class Circle {
    private double radius;
    private int counter;

    public Circle(int counter) {
        this.counter = counter;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        double result = Math.PI * Math.pow(radius, 2);
//        System.out.printf("The area of the circle is: %d", result);
        return result;
    }

    public double getCircumference(double radius) {
        double result = 2 * Math.PI * radius;
//        System.out.printf("The circumference of the circle is: %d", result);
        return result;
    }

    public int circleCounter(int n) {
        return n + 1;
    }
}
