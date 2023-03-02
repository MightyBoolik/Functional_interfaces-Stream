import java.util.ArrayList;
import java.util.List;

public class Stream_example {
    public static void main(String[] args) {
        //Дан массив строк, нужно написать функцию, которая сделает следующее:
        //1. Заменить все буквы а на 9
        //2. Приведет все к верхнему регистру
        //3. Избавится от дубликатов
        //4. Выведет результат
        List<String> stringList = new ArrayList<>();
        stringList.add("example");
        stringList.add("example");
        stringList.add("legacy");
        stringList.add("legacy");
        stringList.add("tutorial");
        stringList.stream().map(s -> s.replace('a','9'))
                .map(String::toUpperCase)
                .distinct()
                .map(String::trim)
                .forEach(System.out::println);
    }


}