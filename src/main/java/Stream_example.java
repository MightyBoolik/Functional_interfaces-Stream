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
                .forEach(System.out::println);

        //Дано предложение, нужно:
        //1. Посчитать, сколько в нем слов
        //2. Вывести только слова на букву д
        List<String> words = new ArrayList<>();
        String phrase = "This is phrase for test";
        for(String word: phrase.split(" ")){
            words.add(word);
        }
        System.out.println(phrase + "- words quantity: " + words.stream().count());
        words.stream().filter(s -> s.startsWith("T") || s.startsWith("t")).forEach(System.out::println);
    }


}
