package shapes;

public class ShapesTest {
    public static void main (String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.printf("The area for box1 is: %d \n", box1.getArea());
        System.out.printf("The perimeter for box1 is: %d \n", box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("The area for box3 is: %d \n", box2.getArea());
        System.out.printf("The perimeter for box2 is: %d \n", box2.getPerimeter());

        Square box3 = new Square(6);
        System.out.printf("The area for box3 is: %d \n", box3.getArea());
        System.out.printf("The perimeter for box3 is: %d ", box3.getPerimeter());
    }
}
