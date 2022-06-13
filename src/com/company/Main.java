package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Set<City> set = new HashSet<>();
        set.add(new City(random.nextInt(10), " Москва"));
        set.add(new City(random.nextInt(20), " Токио"));
        set.add(new City(random.nextInt(30), " Кыргызстан"));
        set.add(new City(random.nextInt(40), " Алматы!"));
        set.add(new City(random.nextInt(50), " Чикаго"));
        set.add(new City(random.nextInt(60), " Дубай!"));
        set.add(new City(random.nextInt(70), " Египет!"));
        set.add(new City(random.nextInt(80), " Турция!"));

        Set<City> treeSet = new TreeSet<>(set);
        Set<City> treeSetTak = new TreeSet<>(set);

        for (City s : treeSet) {
            if (s.getCode() % 2 != 0) {
                treeSet.add(s);
                System.out.println(s);
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (City city : treeSetTak) {
            if (city.getCode() % 2 != 1) {
                treeSetTak.add(city);
                System.out.println(city);
            }
        }
    }
}
