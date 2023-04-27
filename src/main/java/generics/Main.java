package generics;

public class Main {
    public static void main(String[] args) {

        Integer [] array = {1, 2, 3, 4, 5};
        Double [] array1 = {1.2, 2.2, 3.2, 4.2, 5.2};
        GenericForArray<Integer> generic = new GenericForArray<>(array);
        GenericForArray<Double> generic1 = new GenericForArray<>(array1);
        System.out.println(generic1.getMinimum());
        System.out.println(generic1.getMaximum());
        System.out.println(generic.getMinimum());
        System.out.println(generic.getMaximum());
        System.out.println(Calculator.sum(9223372036854775805L,2L));
        System.out.println(Calculator.multiply(5,7));
        System.out.println(Calculator.substraction(15.5,7.5));
        System.out.println(Calculator.divide(15,3));
    }
}
