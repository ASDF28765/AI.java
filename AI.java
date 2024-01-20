import java.util.Scanner;

public class AI {

    public static void main(String[] args) {
        try (// user information
                Scanner scnr = new Scanner(System.in)) {
            System.out.println("Hello, My name is Xi,I am your personal assistance");
            System.out.print("What is your name: ");
            String name = scnr.nextLine();

            if (name.equals(name)) {
                System.out.println("You have a great name");
            } else {
                System.out.println("Your name is common");
            }

            System.out.print("What is your age: ");
            int age = scnr.nextInt();

            if (age >= 18) {
                System.out.println("YOUR AN ADULT");
            } else {
                System.out.println("YOUR A TEEN");
            }
        }

    }

}
