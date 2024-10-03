import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();  // Read user input as an integer
        scanner.close();    // Close scanner

        System.out.println("You entered: " + name);

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}