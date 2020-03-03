package ru.itsjava.lectures.oop.collection;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Fruit> fruits = new HashMap<>();
        fruits.put("apricot", new Fruit("абрикос", 0.1));
        fruits.put("appleGreen", new Fruit("яблоко", 0.135));
        fruits.put("appleRed", new Fruit("яблоко", 0.25));
        fruits.put("appleGold", new Fruit("ЯблОко", 0.3));
        fruits.put("appleBig", new Fruit("яблоко", 0.452));
        fruits.put("avocado", new Fruit("авокадо", 0.15));
        fruits.put("melon", new Fruit("дыня", 4.0));
        fruits.put("peach", new Fruit("персик", 0.2));
        fruits.put("banana", new Fruit("банан", 0.15));
        fruits.put("pear", new Fruit("груша", 0.22));
        fruits.put("plum", new Fruit("слива", 0.14));

        printFruits(fruits, "Карта : ");

        Map<String, Fruit> copyOfFruits = new HashMap<>(fruits); // б). В новый экзмепляр Map добавим старую карту
        printFruits(copyOfFruits, "Копия карты : ");

        System.out.println("fruits.get(\"appleBig\") = " + fruits.get("appleBig"));   // 2. Получение элемента по ключу


        fruits.remove("plum");   // 3а). Удалим любой фрукт

        printFruits(fruits, "После удаления сливы: ");

        System.out.println("fruits.containsKey(\"appleBig\") = "  // 4. Проверка на наличие: ключ и значение
                + fruits.containsKey("appleBig"));
        System.out.println("fruits.containsKey(\"tomato\") = "
                + fruits.containsKey("tomato"));

        System.out.println("fruits.containsValue(new Fruit (\"яблоко\", 0.452)) = "
                + fruits.containsValue(new Fruit("яблоко", 0.452)));
        System.out.println("fruits.containsValue(new Fruit (\"яблоко\", 1.3)) = "
                + fruits.containsValue(new Fruit("яблоко", 1.3)));

        System.out.println("Все ключи:"); // 5a) Вывести все ключи
        for (String k : fruits.keySet()) {
            System.out.println(k);
        }

        System.out.println("Все значения:");  // 5б) Вывести все значения
        for (Fruit fruit : fruits.values()) {
            System.out.println(fruit);
        }

        printFruits(fruits, "Вывод Ключ - Значение:"); // 5в) Вывести все ключи и значения с помощью entrySet

        int count = 0;      //6 а) Условие на ключ: вернуть количество ключей, длина которых больше 5
        for (String key : fruits.keySet()) {
            if (key.length() > 5) {
                count++;
            }
        }
        System.out.println("Количество ключей, длина которых больше 5: " + count);

        count = 0;           // 6 б) Условие на значение: Вернуть количество фруктов "яблоко"
        for (Fruit fruit : fruits.values()) {
            if (fruit.getName().equals("яблоко")) {
                count++;
            }
        }
        System.out.println("Количество  \"яблоко\": " + count);

        System.out.println("Пропустить 2 элемента, значения которых 'яблоко'," + " все остальные вывести:");
        boolean skip = false;  //7 а) Пропустить 2 элемента, значения которых 'дыня', все остальные вывести.
        count = 0;
        for (Fruit fruit : fruits.values()) {
            if (!skip && fruit.getName().equals("дыня")) {
                skip = ++count == 2;
                continue;
            }
            System.out.println(fruit);
        }

        System.out.println("Вывести все кроме 2 элементов, " +  //7 б) Вывести все кроме 2 элементов, ключи которых начинаются на "p"
                "ключи которых начинаются на \"а\":");
        skip = false;
        count = 0;
 /*       for (Map.Entry<String, Fruit> pair : fruits.entrySet()) {
            if (!skip && pair.getKey().charAt(0) == 'p') {
                skip = ++count == 2;
                continue;
            }
            System.out.println(pair.getValue());
        }*/

        System.out.println("Выводим элементы, значение которых яблоко или ЯблОко_:");   // Возращаем все элементы, значение которых яблоко или ЯблОко_.
        for (Fruit fruit : fruits.values()) {
            if (fruit.getName().equalsIgnoreCase("яблоко")) {
                System.out.println(fruit);
            }
        }




        count = 0;      //10. Найти средний вес всех фруктов.
        double middleWeightAll = 0;
        for (Fruit fruit : fruits.values()) {
            count++;
            middleWeightAll += fruit.getWeight();
        }
        System.out.println("Средний вес: " + (middleWeightAll / count));

    }

    public static void printFruits(Map<String, Fruit> fruits, String mes) {
        if (mes.length() > 0) {
            System.out.println(mes);
        }
        for (Map.Entry<String, Fruit> pair : fruits.entrySet()) {
            System.out.println(pair.getKey() + "\" - " + pair.getValue());
        }
    }
}

