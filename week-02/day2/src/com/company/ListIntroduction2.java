package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Collections.addAll(listA,"Apple", "Avocado", "Blueberries", "Durian", "Lychee");
        ArrayList <String> listB = new ArrayList<>();
        listB.addAll(listA);
        System.out.println(listA.contains("Durian"));
        listB.remove("Durian");
        listA.add(4, "Kiwifruit");
        System.out.println(listA.equals(listB));
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        listB.addAll (Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(listA.get(2));
    }
    /*
Compare the size of List A and List B
Get the index of Durian from List B
 A*/
}
