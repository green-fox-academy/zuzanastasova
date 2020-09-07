package com.company;

public class Sum {
    public static void main (String[] args) {
        int parameter = 5;
        System.out.println(sum(parameter)); // Create the usual class wrapper and main method on your own.
                                            // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
    }
    public static int sum (int number1) {
        int sum = 0;
        for (int i = 0; i <= number1; i++) {
            sum += i;
        }
            return sum;

    }
}
