package JAVAHW5;

import java.util.HashMap;
import java.util.Map;

public class zad1 {
    public static void main(String[] args) {
        
    /*Задача 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.*/

    HashMap<String, String> tel = new HashMap<>(Map.of(
        "+7 981 70570512", "Denis Kolosov",
        "+9 81 78493343", "Peter Kats",
        "+7 911 23475645", "Olga Popova",
        "+9 654 23475645", "Olga Popova",
        "+7 931 70570512", "Denis Kolosov"
    ));
        System.out.println(tel);
    }
}
