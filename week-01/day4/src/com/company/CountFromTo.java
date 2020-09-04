package com.company;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner userInputOne = new Scanner(System.in);
        System.out.println("Please, insert first number:");
        int firstNumber = userInputOne.nextInt();
        Scanner userInputTwo = new Scanner(System.in);
        System.out.println("Please, insert second number:");
        int secondNumber = userInputTwo.nextInt();
        while (firstNumber>secondNumber){
            System.out.println("The second number should be bigger");
        }
        while (firstNumber<(secondNumber-1)) {
            firstNumber++;
            System.out.println(firstNumber);
        }

        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
    }
}
