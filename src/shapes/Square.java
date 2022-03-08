package shapes;

public class Square extends Rectangle{


// this is a stupid Java requirement
    public Square(int length, int width) {
        super(length, width);
    }
    // this is what I need to use/pay attention to
    public Square(int side) {
        super(side, side);

    }
}
