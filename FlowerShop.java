import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowerShop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuChoice;

// Loop to display the menu and get the user choice
        while (true) {
            
            System.out.println("\nFlower shop menu\n");
            System.out.println("1. Order bouquet and get the price");
            System.out.println("2. Display statistics");
            System.out.println("3. Exit");

            // Try-catch block to handle invalid input
            try {
                menuChoice = input.nextInt();

                if (menuChoice == 1) {
                    orderDetailsAndPriceCalculation();
                } else if (menuChoice == 2) {
                    summaryStatistics();
                } else if (menuChoice == 3) {
                    System.out.println("Thank you for visiting! Goodbye.");
                    input.close();
                    return; // Exit the program
                } else {
                    System.out.println("Invalid choice. Please choose a number between 1 and 3.");
                }
            }    
            
            catch (InputMismatchException invalidInput) {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                input.next(); // Clear the invalid input
            }
        }
    }

    public static void orderDetailsAndPriceCalculation() {
        System.out.println("A bouquet has been ordered.");
        
    }

    public static void summaryStatistics() {
        System.out.println("Summary statistics provided.");
        
    }
}
