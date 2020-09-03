import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner numberFirst = new Scanner(System.in);
        System.out.println("Write whole number: ");
        int first = numberFirst.nextInt();
        Scanner numberSecond =new Scanner(System.in);
        System.out.println("Write whole number: ");
        int second = numberSecond.nextInt();
        if (first > second) {
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }
        // Write a program that asks for two numbers and prints the bigger one
    }
}
