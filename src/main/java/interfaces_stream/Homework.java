package interfaces_stream;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class Homework {
    public static void main(String[] args) {
//Создать лямбда выражение,
// которое принимает на вход число
// и возвращает строку «Положительное число», «Отрицательное число» или «Ноль»
        //n -> (n == 0 ? "Ноль" : (n > 0 ? "Положительное число" : "Отрицательное число"));
        Function<Integer, String> function = integer -> {
            String s;
            if (integer > 0)
                s = "Положительное число";
            else if (integer < 0)
                s = "Отрицательное число";
            else {
                s = "Ноль";
            }
            return s;
        };
        System.out.println(function.apply(0));

        //Создать лямбда выражение,
        // которое возвращает случайное число от 0 до 25
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(26);
        System.out.println(supplier.get());
    }
}