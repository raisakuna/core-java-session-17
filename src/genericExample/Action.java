package genericExample;

public interface Action<T> {

    void add(T  a, T b);

    void multiply(T a, T b);

    void substract(T a, T b);

    void divide(T a, T b);

}
