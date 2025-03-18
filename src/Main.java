//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
  Найти и вывести список уникальных слов, из которых состоит массив.
   Посчитать, сколько раз встречается каждое слово*/
import java.util.*;

public class Main {

   public static void main(String[] args) {

       ArrayList<String> words = new ArrayList<>();
        words.add("Book");
        words.add("Joke");
        words.add("Tree");
        words.add("Drink");
        words.add("Book");
        words.add("Tree");
        words.add("Tree");
        words.add("People");
        words.add("Product");
        words.add("Product");
        words.add("Product");
        words.add("Product");
        words.add("Coke");
        words.add("Joke");
        words.add("Game");
        words.add("Shame");
        words.add("Name");
        words.add("Object");
        words.add("Picture");
        words.add("Picture");

        System.out.println("Первоначальный список слов, из которых состоит массив: ");
        //words.forEach(System.out::println);
        System.out.println(words);

        System.out.println("Список уникальных слов, из которых состоит массив: ");
        HashSet<String> uniqueWords = new HashSet<>(words);
        //uniqueWords.forEach(System.out::println);
        System.out.println(uniqueWords);

        System.out.println("Каждое слово встречается следующее количество раз:");

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        //wordsCount.entrySet().forEach(System.out::println);
        //System.out.println(wordsCount);
        System.out.println(wordsCount.entrySet());


       TelephoneDirectory directory = new TelephoneDirectory();

       directory.add("Petrov", "89111234567");
       directory.add("Petrov", "89111234568");
       directory.add("Sidorov", "89111234569");
       directory.add("Sidorov", "89111234570");
       directory.add("Ivanov", "89311534567");

       directory.get("Petrov");
       directory.get("Ivanov");
       directory.get("Sidorov");
       directory.get("Pavlov");
    }

   }


