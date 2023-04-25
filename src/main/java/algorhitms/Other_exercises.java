package algorhitms;

public class Other_exercises {
    //Написать функцию, которая посчитает и выведет факториал указанного числа
    public static Integer getFactorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i ;
        }
        return result;
    }
    public static int recursionFactorial(int n){
        if (n == 1){
            return 1;
        }
        return n * recursionFactorial(n - 1);
    }
    //Написать функцию для сортировки массива пузырьковым методом
    public static int[] bubbleSort(int [] array){
        int buffer;

        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                }
            }
        }
        return array;
    }
    //Написать функцию, проверяющую является ли указанная строка палиндромом
//шалаш
    public static String getReversedWord(String word){
        String result = "";
        for(int i = word.length() - 1; i >= 0; i--){
            result += word.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String word){
        return getReversedWord(word).equals(word);
    }
}