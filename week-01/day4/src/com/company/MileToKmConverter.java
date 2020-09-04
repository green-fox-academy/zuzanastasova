import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner milesDistance = new Scanner(System.in);
        System.out.println("Put the distance in miles: ");
        double miles = milesDistance.nextDouble();
        double km = miles * 1.609344;
        System.out.println("It is " + km + " km.");
    }
}