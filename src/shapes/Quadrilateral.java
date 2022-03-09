package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected long length;
    protected long width;

    public Quadrilateral(long length, long width) {
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public abstract long setLength();

    public long getWidth() {
        return width;
    }

    public abstract long setWidth();
}
