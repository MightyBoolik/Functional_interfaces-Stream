package generics;

public class Main {
    public static void main(String[] args) {
        Integer [] array = {1, 2, 3, 4, 5};
        GenericForArray<Integer> generic = new GenericForArray<>(array);
        System.out.println(generic.getMinimum());
        System.out.println(generic.getMaximum());
    }
}
