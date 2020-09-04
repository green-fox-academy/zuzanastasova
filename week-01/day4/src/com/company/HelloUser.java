import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner enterName = new Scanner(System.in);
        System.out.println("What is your Name?");
        String userName = enterName.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}