package com.company;

import java.util.Scanner;

public class Factorio {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert number (from 1 to 10):");
        int parameter = userInput.nextInt();
        System.out.println(factorio(parameter));
    }
    public static int factorio (int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
