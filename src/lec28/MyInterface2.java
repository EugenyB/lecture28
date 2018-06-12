package lec28;

public interface MyInterface2 {
    int ANSWER = 24;
//    int f(int x);
    double f(double x);

    default int f(int x) {
        return 12;
    }
}
