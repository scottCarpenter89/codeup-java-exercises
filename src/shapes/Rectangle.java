package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(long length, long width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double length) {

    }

}
