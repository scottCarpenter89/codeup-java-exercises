package shapes;

public class Square extends Rectangle{
private int side;

// this is a stupid Java requirement
    public Square(int length, int width) {
        super(length, width);
    }
    // this is what I need to use/pay attention to
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
//        return super.getArea();
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
//        return super.getPerimeter();
    }
}
