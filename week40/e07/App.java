import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;
        boolean quit = false;
        do{
            isUpperCase = false;
            isLowerCase = false;
            isDigit = false;
            System.out.println("Enter a password:");
            String password = scanner.nextLine();
            for(int i = 0; i < password.length(); i++){
                if(Character.isUpperCase(password.charAt(i))){
                    isUpperCase = true;
                }
                else if(Character.isLowerCase(password.charAt(i))){
                    isLowerCase = true;
                }
                else if(Character.isDigit(password.charAt(i))){
                    isDigit = true;
                }
            }

            if(password.length() < 8 || !isUpperCase || !isLowerCase || !isDigit){
                System.out.println("Password invalid. At least 8 characters, one upper letter and one digit.");
            }
            else{
                System.out.println("Valid password!");
                quit = true;
            }
        }while(!quit);
         scanner.close();    // Close scanner
    }
}