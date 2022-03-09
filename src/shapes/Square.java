package shapes;

public class Square extends Rectangle{


//    // this is DRY
//private int side;
//
//// this is a stupid Java requirement
//    public Square(int length, int width) {
//        super(length, width);
//    }
//    // this is what I need to use/pay attention to
//    public Square(int side) {
//        // rectangle constructor
//        super(side, side);
//        // DRY
//        this.side = side;
//    }
//
//    @Override
//    public int getArea() {
//        // this utilizes Rectangle data that is inherited & its methods
//            // return this.length * this.width;
//        return side * side;
//    }
//
//    @Override
//    public int getPerimeter() {
//        // this utilizes Rectangle data that is inherited & its methods
//            // return 4 * this.length;
//        return 4 * side;
////        return super.getPerimeter();
//    }
}
