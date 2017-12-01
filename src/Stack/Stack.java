package Stack;

public interface Stack<T> extends Iterable<T> {

    void push(T value);

    T pop();
}
