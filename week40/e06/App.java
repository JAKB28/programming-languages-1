import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object
        String name;

        do{
            System.out.println("Palindrome test, please enter some text:");
            name = scanner.nextLine();
            String reverseName = "";
            for(int i = name.length()-1; i >= 0; i--){
                reverseName = reverseName + name.charAt(i);
            }
            if(name.equals("Quit")){
                continue;        
            }
            else if(name.toLowerCase().equals(reverseName.toLowerCase())){
                System.out.println(name + " is a palindrome.");
            }
            else{
                System.out.println(name + " is not a palindrome.");
            }
        }while(!name.contentEquals("Quit"));
         scanner.close();    // Close scanner
    }
}