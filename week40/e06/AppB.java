import java.util.Scanner;

public class AppB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a scanner object
        String sentence;

        do{
            System.out.println("Palindrome test, please enter some text: (Quit will exit)");
            sentence = scanner.nextLine();
            String newSentence = sentence;
            String reverseSentence = "";

            //Delete any spaces and punctuation
            newSentence = sentence.replaceAll("[^a-zA-Z]", "");
            //Reverse the sentence
            for(int i = newSentence.length()-1; i >= 0; i--){
                reverseSentence = reverseSentence + newSentence.charAt(i);
            }
            if(sentence.equals("Quit")){
                continue;        
            }
            else if(newSentence.toLowerCase().equals(reverseSentence.toLowerCase())){
                System.out.println(sentence + " is a palindrome.");
            }
            else{
                System.out.println(sentence + " is not a palindrome.");
            }
        }while(!sentence.contentEquals("Quit"));
         scanner.close();    // Close scanner
    }
}