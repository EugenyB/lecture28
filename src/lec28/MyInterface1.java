package lec28;

public interface MyInterface1 {
    int ANSWER = 42;
    double f(double x);

    default int f(int x) {
        return 21;
    }
}
