package com.company;

import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for (String name:names) {
            System.out.println(name);
        }
        for (int nameAndNumber = 0; nameAndNumber < names.size(); nameAndNumber++) {
            int sequence = nameAndNumber + 1;
            System.out.println(sequence +". "+ names.get(nameAndNumber));
        }
        names.remove(1);
        for (String name: names) {
            System.out.println(name);
        };
        System.out.println(names.size());
        for (int nameAndNumber = names.size() - 1; nameAndNumber >= 0; nameAndNumber--) {
            System.out.println(names.get(nameAndNumber));
        }
        names.clear();
        System.out.println(names.isEmpty());
    }
    /*
    Print out the number of elements in the list
    Print out the 3rd element */

}
