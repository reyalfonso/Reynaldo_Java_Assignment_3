
import java.util.Scanner;

public class Chapter14_9 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter your words :");
        String inputWords = input.nextLine();
        System.out.println();
        
        String[] tokens = inputWords.split("\\s+");

        System.out.println("Sentence with words reversed :");
        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.print(tokens[i] + " ");
        }
        System.out.println();

        input.close();
    } // main
} // class
