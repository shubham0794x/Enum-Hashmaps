package com.ironhack;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyClass {
    public static void main(String[] args) {

        Map<String, String> nationalLeaders = new HashMap<>();

        nationalLeaders.put("Spain", "Pedro Sanchez");
        nationalLeaders.put("India", "Narender Modi");
        nationalLeaders.put("Japan", "Shizno Abe");
        nationalLeaders.put("Ecuador", "Lenin Moreno");

        Map<String, String> sortedHash = new TreeMap<>(nationalLeaders);

        nationalLeaders.put("Germany", "Angela Merkel");

        System.out.println(nationalLeaders);

        System.out.println(sortedHash);
    }
}
