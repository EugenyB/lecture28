package lec28;

public class MyClass implements MyInterface1, MyInterface2 {

    @Override
    public double f(double x) {
        return 1;
    }

    @Override
    public int f(int x) {
        return 0;
    }

}
