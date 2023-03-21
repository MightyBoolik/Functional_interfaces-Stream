import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Functional_interfaces_example {
    public static void main(String[] args) {
        //Дан список строк, нужно вывести в консоль список,
        // где каждая строка заменена тремя копиями самой себя
        // (напр. ["a", "bb", "ccc"] → ["aaa", "bbbbbb", "ccccccccc"]).
        // Использовать Consumer
        List<String> stringList = Arrays.asList("a", "bb", "ccc");
//        Consumer<List<String>> stringConsumer = s -> {
            stringList.stream().map(i -> i.concat(i.concat(i))).forEach(System.out::println);

//        };
//        stringConsumer.accept(stringList);

        //Дан список целых чисел,
        // нужно вернуть список квадратов этих чисел
        // (напр. [1, 2, 3] → [1, 4, 9]). Использовать Function.
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers = integerList.stream().map(integer -> integer * integer).collect(Collectors.toList());
//        Function<List<Integer>, List<Integer>> integerFunction = integers -> {
//            for (int i = 0; i < integers.size(); i++) {
//                integers.set(i, (int) Math.pow(integers.get(i), 2));
//            }
//            return integers;
//        };
        System.out.println(integers);

        //Создать лямбда выражение, которое проверяет,
        // что строка начинается с буквы “A” или “С” и заканчивается буквой “Р”.
        // Использовать Predicate.
        checkByPredicate('A','C', 'E', "AttractivE");
    }
    public static void checkByPredicate (char firstA, char firstB, char lastC, String word){
        Predicate<String> checkFirstLetterA = s ->
                (s.startsWith(String.valueOf(firstA).toUpperCase()) || s.startsWith(String.valueOf(firstB).toUpperCase()))
                        && s.endsWith(String.valueOf(lastC).toUpperCase());
//        Predicate<String> checkFirstLetterC = s -> s.toUpperCase().startsWith(String.valueOf(firstB));
//        Predicate<String> checkLastLetter = s -> s.toUpperCase().endsWith(String.valueOf(lastC));
        System.out.println(checkFirstLetterA.test(word));
    }
}
