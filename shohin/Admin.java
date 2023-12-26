import java.util.HashSet;
import java.util.Set;

public class Admin extends User {
    private Set<User> users;

    public Admin(String username) {
        super(username);
        this.users = new HashSet<>();
    }


    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
            System.out.println("User added: " + user.getUsername());
        } else {
            System.out.println("User already exists: " + user.getUsername());
        }
    }


    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            System.out.println("User removed: " + user.getUsername());
        } else {
            System.out.println("User not found: " + user.getUsername());
        }
    }


    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin("admin");
        admin.startAdminConsole();
    }


    public void startAdminConsole() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command: (add, remove, view, exit)");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.println("Enter username to add:");
                    String addUser = scanner.nextLine().trim();
                    addUser(new User(addUser));
                    break;

                case "remove":
                    System.out.println("Enter username to remove:");
                    String removeUser = scanner.nextLine().trim();
                    removeUser(new User(removeUser));
                    break;

                case "view":
                    System.out.println("Users:");
                    viewUsers();
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
