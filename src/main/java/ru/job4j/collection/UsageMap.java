package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ubatyr@mail.ru", "Bobozhonov Batyr Uktamovich");
        map.put("parsentev@yandex.ru", "Arsentev Petr");
        map.put("ubatyr@mail.ru", "Bobozhonov Batyr");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println((key + " = " + value));
        }
    }
}
