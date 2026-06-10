package org.example;

import org.example.services.UserService;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            // If no user logged in → show main menu
            if (userService.getLoggedInUser() == null) {

                System.out.println("\n===== MAIN MENU =====");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                if (choice == 1) {
                    System.out.print("Enter UserId: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();

                    userService.register(id, name, password);
                }

                else if (choice == 2) {
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();

                    userService.login(name, password);
                }

                else if (choice == 3) {
                    System.out.println("Exiting application...");
                    break;
                }

                else {
                    System.out.println("Invalid choice!");
                }

            }

            // If user is logged in → show user menu
            else {

                System.out.println("\n===== USER MENU =====");
                System.out.println("Welcome " +
                        userService.getLoggedInUser().getName());
                System.out.println("1. Book Ticket");
                System.out.println("2. View My Bookings");
                System.out.println("3. Logout");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("Booking feature coming next...");
                }

                else if (choice == 2) {
                    System.out.println("View bookings feature coming next...");
                }

                else if (choice == 3) {
                    userService.logout();
                }

                else {
                    System.out.println("Invalid choice!");
                }
            }
        }

        scanner.close();
    }
}