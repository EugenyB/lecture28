package lec28;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(((MyInterface1)c).ANSWER);
        System.out.println(c.f(5));

        Shape[] shapes = {new Circle(3.5), new Square(7), new Circle(3), new Square(3), new Square(6)};
        for (Shape shape : shapes) {
            System.out.println(shape.calcArea());
        }
        System.out.println("----------------------------");
        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println(shapes[2].compareTo(shapes[1]));
        Arrays.sort(shapes);
        for (Shape shape : shapes) {
            shape.draw();
        }
        System.out.println("-------------------------");
//        Arrays.sort(shapes, new SizeComparator());
        Arrays.sort(shapes, Comparator.comparingDouble(Shape::getSize));
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
