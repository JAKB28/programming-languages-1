import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        scanner.close();    // Close scanner
        if(name.contentEquals("Louis")){
            System.out.println("Are you French?");
        }
        else{
            System.out.println("What a great name!");
        }
    }
}