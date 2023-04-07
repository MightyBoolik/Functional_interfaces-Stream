package generics;

public class Calculator {

    public static <T extends Number, V extends Number> double sum(T t, V v) {
        double num1 = t.doubleValue();
        double num2 = v.doubleValue();
        return num1 + num2;
    }

    public static <T extends Number, V extends Number> double substraction(T t, V v) {
        double num1 = t.doubleValue();
        double num2 = v.doubleValue();
        return num1 - num2;
    }

    public static <T extends Number, V extends Number> double multiply(T t, V v) {
        double num1 = t.doubleValue();
        double num2 = v.doubleValue();
        return num1 * num2;
    }

    public static <T extends Number, V extends Number> double divide(T t, V v) {
        double num1 = t.doubleValue();
        double num2 = v.doubleValue();
        return num1 / num2;
    }
}
