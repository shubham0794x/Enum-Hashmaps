package com.ironhack;

import java.util.HashMap;
import java.util.Map;


public class MyClass2 {
    public static void main(String[] args) {
        Map<String, Country> countryMap = new HashMap<>();

        Country spain = new Country("Spain","Madrid",4600000,"Pedro Sanchez");
        Country india = new Country("India", "New Delhi",100000,"Narender Modi");
        Country japan = new Country("Japan","Tokyo", 500000,"Shinzo Abe");

        countryMap.put("India",india);
        countryMap.put("Spain",spain);
        countryMap.put("Japan",japan);

        System.out.println(countryMap);
        System.out.println(countryMap.get("Japan").getPopulation() );
        System.out.println(countryMap.get("India").getCapital());
        countryMap.get("Japan").setPopulation(6000000);
        System.out.println(countryMap.get("Japan").getPopulation() );


    }
}
