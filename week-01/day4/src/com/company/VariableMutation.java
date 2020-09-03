package com.company;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        // make b smaller by 7

        System.out.println(b);

        int c = 44;
        c *= 2;
        // please double c's value

        System.out.println(c);

        int d = 125;
        d /= 5;
        // please divide by 5 d's value

        System.out.println(d);

        int e = 8;
        e *= e;
        // please cube of e's value

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f1BiggerF2 = f1 > f2;
        System.out.println(f1BiggerF2);
        // tell if f1 is bigger than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;
        boolean doubleG1BiggerG2 = (g2 * 2) > g1;
        System.out.println(doubleG1BiggerG2);
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        boolean divisor = h%11 == 0;
        System.out.println(divisor);
        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        boolean squared = (i1 > Math.pow(i2, 2)) && (i1 < Math.pow(i2,4));
        System.out.println(squared);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        boolean dividable = (j%3 == 0) || (j%5 == 0);
        System.out.println(dividable);
        // tell if j is dividable by 3 or 5 (print as a boolean)
    }
}