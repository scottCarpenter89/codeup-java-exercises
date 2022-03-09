package shapes;

public class ShapesTest {
    public static void main (String[] args) {
        Measurable myShape1 = new Rectangle(8, 5);
        System.out.printf("The area of the rectangle is: %.2f\n", myShape1.getArea());
        System.out.printf("The perimeter of the rectangle is: %.2f\n", myShape1.getPerimeter());
        Measurable myShape2 = new Square(5);
        System.out.printf("The area of the square is: %.2f\n", myShape2.getArea());
        System.out.printf("The perimeter of the square is: %.2f", myShape2.getPerimeter());

//        myShape1.getLength();


        // Q9 Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
            // java: shapes.Rectangle is not abstract and does not override abstract method getPerimeter() in shapes.Measurable
            // you are required to use all the methods of an interface

        // Q10 What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
            // there is no visibility into Quadrilateral's methods because it wasn't instantiated as a Quadrilateral; was instantiated as a measurable type

    }
}
