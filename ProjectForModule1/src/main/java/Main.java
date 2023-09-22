import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "Sai Mao";
        String password = "1234";

        Scanner sc = new Scanner(System.in);

        // Request Username
        System.out.println("Enter your username");
        System.out.print("User Name : ");
        String name = sc.nextLine();
        System.out.println();

        // Request Password
        System.out.println("Enter your password");
        System.out.print("Password : ");
        String pass = sc.nextLine();

        // Show Result
        boolean isAuthenticated = (name.equals(username) && pass.equals(password));
        String message = isAuthenticated ? "Login Success!" : "Login Failed! Try again!";
        System.out.println();
        System.out.println("##########################");
        System.out.println(message.toUpperCase());
        System.out.println("##########################");
    }
}
