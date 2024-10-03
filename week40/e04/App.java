import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        scanner.close();    // Close scanner

        System.out.println("You entered: " + name);

        for(int i = name.length()-1; i >= 0; i = i - 2){
            System.out.println(name.charAt(i));
        }
    }
}