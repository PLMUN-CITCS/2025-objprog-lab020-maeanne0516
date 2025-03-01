import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to continuously show the menu until the user chooses to exit
        while (true) {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            handleMenuChoice(choice);
        }
    }

    // Method to display the menu options to the user
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);  // Exit the program
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option (1-3).");
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
