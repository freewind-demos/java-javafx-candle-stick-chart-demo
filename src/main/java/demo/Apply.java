package demo;

public interface Apply<T> {
    void apply(T t);

    static <T> T apply(T t, Apply<T> callback) {
        callback.apply(t);
        return t;
    }
}