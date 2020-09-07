package com.company;

public class Greet {
    public static void main(String[] args) {
        String al = "Green Fox";
        greet(al);
//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Green Fox`
// - Greet `al`
    }
    public static void greet(String Name){
        System.out.println("Greetings dear, " + Name );

    }
}
