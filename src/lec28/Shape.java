package lec28;

public abstract class Shape implements Drawable, Comparable<Shape> {
    private double size;

    public Shape(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    // 2.8.1
    public abstract double calcArea();

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.calcArea(), o.calcArea());
        //        if (calcArea() < o.calcArea()) return -1;
//        if (calcArea() > o.calcArea()) return 1;
//        return 0;
    }
}
