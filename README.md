# Flower Shop Management System 

This console-based application was developed as part of the **Programming** module during my Bachelor of Science (BSc) in Computing at **Arden University (Manchester)**. The project showcases solid programming fundamentals in Java, focusing on interactive user interfaces, operational flow control, input validation, and structural modularity.

## Programming Concepts Applied
* **Language:** Java (JDK 8+)
* **Input Handling:** `Scanner` API for real-time user terminal interactions.
* **Flow & Menu Architecture:** Implementation of an infinite execution loop (`while`) combined with conditional branching (`if-else`) to establish a persistent application state.
* **Exception Handling:** Strategic utilization of `try-catch` blocks catching `InputMismatchException` to prevent runtime system crashes during invalid user input entries.
* **Modular Architecture:** Separation of concerns using distinct custom methods (`orderDetailsAndPriceCalculation` and `summaryStatistics`) to keep the `main` driver execution clean and maintainable.

---

## Application Structure & Features

The system simulates a terminal console dashboard for a floral retail store, featuring three key functional options:

1.  **Bouquet Customization & Pricing:** Triggered through option `1`, handling the internal workflow for processing structural floral orders and calculating bulk pricing matrices.
2.  **Administrative Summary Statistics:** Triggered through option `2`, designed to aggregate operational storefront transaction metrics, revenue logs, or inventory summaries.
3.  **Graceful Exit Routine:** Triggered through option `3`, safely closing system streams (`input.close()`) and terminating execution loops smoothly.

---

## Core Source Code Preview

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuChoice;

        while (true) {
            System.out.println("\nFlower shop menu\n");
            System.out.println("1. Order bouquet and get the price");
            System.out.println("2. Display statistics");
            System.out.println("3. Exit");

            try {
                menuChoice = input.nextInt();

                if (menuChoice == 1) {
                    orderDetailsAndPriceCalculation();
                } else if (menuChoice == 2) {
                    summaryStatistics();
                } else if (menuChoice == 3) {
                    System.out.println("Thank you for visiting! Goodbye.");
                    input.close();
                    return; 
                } else {
                    System.out.println("Invalid choice. Please choose a number between 1 and 3.");
                }
            } catch (InputMismatchException invalidInput) {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                input.next(); // Clears the invalid buffer memory
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
