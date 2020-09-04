import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner numOfChickens = new Scanner(System.in);
        System.out.println("How many chickens owns the farmer?");
        int chickens = numOfChickens.nextInt();
        Scanner numOfPigs = new Scanner(System.in);
        System.out.println("How many pigs owns the farmer?");
        int pigs = numOfPigs.nextInt();
        int legs = chickens * 2 + pigs * 4;
        System.out.println("Chickens and pigs have together " + legs + " legs.");

    }
}