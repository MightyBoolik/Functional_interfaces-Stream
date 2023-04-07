package generics;

public class Main {
    public static void main(String[] args) {
        Integer [] array = {1, 2, 3, 4, 5};
        GenericForArray<Integer> generic = new GenericForArray<>(array);
        System.out.println(generic.getMinimum());
        System.out.println(generic.getMaximum());
        System.out.println(Calculator.sum(5,5));
        System.out.println(Calculator.multiply(5,7.5));
        System.out.println(Calculator.substraction(15,7.5));
        System.out.println(Calculator.divide(15,3));
    }
}
