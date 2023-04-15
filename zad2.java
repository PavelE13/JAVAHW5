package JAVAHW5;

import java.util.*;
import java.util.HashMap;

public class zad2 {
    public static void Repeat (Map<String,String> map) {
        List<String> namelist = new ArrayList<>();
        HashMap<String, Integer> namemap = new HashMap();

        for (String v : map.values()) {
            namelist.add(v);
        }

        //System.out.println(namelist);
        for (String v : map.values()) {
            //System.out.println(v);
            int count = 0;
            for (int i = 0; i < namelist.size(); i++){
                if (v == namelist.get(i)){
                    count++;
                }
               // System.out.println(v + " = " + count);
                namemap.put(v, count);
            }
        }
        //System.out.println(namelist);
        //System.out.println(namemap);
        namemap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        Map<String, String> tel = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("Иванов", "Иван"),
            new AbstractMap.SimpleEntry<>("Петрова", "Светлана"),
            new AbstractMap.SimpleEntry<> ("Мусина", "Анна"),
            new AbstractMap.SimpleEntry<>("Крутова", "Анна"),
            new AbstractMap.SimpleEntry<>("Юрин", "Иван"),
            new AbstractMap.SimpleEntry<>("Лыков", "Петр"),
            new AbstractMap.SimpleEntry<>("Чернов", "Павел"),
            new AbstractMap.SimpleEntry<>("Чернышов", "Петр"),
            new AbstractMap.SimpleEntry<>("Федорова", "Мария"),
            new AbstractMap.SimpleEntry<>("Светлова", "Марина"),
            new AbstractMap.SimpleEntry<>("Савина", "Мария"),
            new AbstractMap.SimpleEntry<>("Рыкова", "Мария"),
            new AbstractMap.SimpleEntry<>("Лугова", "Марина"),
            new AbstractMap.SimpleEntry<>("Владимирова", "Анна"),
            new AbstractMap.SimpleEntry<>("Мечников", "Иван"),
            new AbstractMap.SimpleEntry<>("Петин", "Петр"),
            new AbstractMap.SimpleEntry<>("Ежов", "Иван")
    );
    Repeat(tel);
    }
}
