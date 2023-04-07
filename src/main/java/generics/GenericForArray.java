package generics;

import java.util.Arrays;
import java.util.Comparator;

public class GenericForArray<T extends Comparable> {
    private T[] array;

    public GenericForArray(T[] array) {
        this.array = array;
    }

    public int getMinimum() {
        return (int) Arrays.stream(array).min(Comparator.naturalOrder()).get();
    }

    public int getMaximum() {
        return (int) Arrays.stream(array).max(Comparator.naturalOrder()).get();
    }
}
