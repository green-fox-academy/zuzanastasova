package com.company;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert number, please:");
        int number = userInput.nextInt();
        Function(number);
    }
    public static int Function (int number1) {
        int function = 0;
        try {
            function = 10 / number1;
            System.out.println(function);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0!");
        }
        return function;
    }

}
