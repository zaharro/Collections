/*2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий
и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи,
а с помощью методы get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны.
Не забыть про использование интерфейса.*/

import java.util.*;

public class TelephoneDirectory {

    private final Map<String, ArrayList<String>> items = new HashMap<>();

    public void add(String surname, String phoneNumber) {

        if (items.get(surname) != null) {

            if (!items.get(surname).contains(phoneNumber))
                items.get(surname).add(phoneNumber);
        } else {
            ArrayList<String> numberList = new ArrayList<>();
            numberList.add(phoneNumber);
            items.put(surname, numberList);
        }
    }

    public void get(String surname) {
        if (items.get(surname) != null)
            System.out.printf("Телефон контакта %s: %s\n", surname, items.get(surname));
        else
            System.out.printf("Телефон контакта %s не найден\n", surname);
    }

}
