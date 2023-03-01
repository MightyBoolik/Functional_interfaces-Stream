import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Functional_interfaces_example {
    public static void main(String[] args) {
        //Дан список строк, нужно вывести в консоль список,
        // где каждая строка заменена тремя копиями самой себя
        // (напр. ["a", "bb", "ccc"] → ["aaa", "bbbbbb", "ccccccccc"]).
        // Использовать Consumer

        List<String> stringList = Arrays.asList("a", "bb", "ccc");
        Consumer<List<String>> stringConsumer = s -> {
            for (int i = 0; i < s.size(); i++) {
                System.out.println(s.get(i).concat(s.get(i) + s.get(i)));
            }
        };
        stringConsumer.accept(stringList);

        //Дан список целых чисел,
        // нужно вернуть список квадратов этих чисел
        // (напр. [1, 2, 3] → [1, 4, 9]). Использовать Function.
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        Function<List<Integer>, List<Integer>> integerFunction = integers -> {
            for (int i = 0; i < integers.size(); i++) {
                integers.set(i, (int) Math.pow(integers.get(i), 2));
            }
            return integers;
        };
        System.out.println(integerFunction.apply(integerList));

        //Создать лямбда выражение, которое проверяет,
        // что строка начинается с буквы “A” или “С” и заканчивается буквой “Р”.
        // Использовать Predicate.
    }

}
