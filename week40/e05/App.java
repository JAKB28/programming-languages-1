import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object
        String name;
        String addedNames = "";
        do{
            System.out.print("Enter a name: ");
            name = scanner.nextLine();
            if(name.contentEquals("Quit")){
                continue;
            }
            else{
                addedNames = addedNames + name;
                System.out.println(addedNames);
            }
        }while(!name.contentEquals("Quit"));
         scanner.close();    // Close scanner
    }
}