package project_shohin;
import java.lang.System.Logger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;


class Admin extends User {
    public Admin(String username) {
        super(username);
        new HashSet<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Assuming there is one admin for simplicity
        Admin admin = new Admin("admin");

        while (true) {
            System.out.println("Enter a command: (add, remove, view, exit)");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.println("Enter username to add:");
                    String addUser = scanner.nextLine().trim();
                    admin.addUser(new User(addUser));
                    break;

                case "remove":
                    System.out.println("Enter username to remove:");
                    String removeUser = scanner.nextLine().trim();
                    admin.removeUser(new User(removeUser));
                    break;

                case "view":
                    System.out.println("Users:");
                    admin.viewUsers();
                    break;

                case "exit":
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }
}

