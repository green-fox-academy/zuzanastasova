package com.company;

public class Cuboid {

    public static void main(String[] args) {
        double height = 100;
        double length = 300;
        double width = 239.5;
        double surfaceArea = 2 * (length * width + width * height + height * length);
        double volume = length * width * height;
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }

}
