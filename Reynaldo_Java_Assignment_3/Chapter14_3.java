
import java.util.Scanner;

public class Chapter14_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.println("Enter the first string:");
        String string1 = input.nextLine();

        System.out.println("Enter the second string:");
        String string2 = input.nextLine();

        int compareString = string1.compareTo(string2);

        if (compareString < 0) {
            System.out.println(string1 + " is less than "+ string2);
        } else if (compareString > 0) {
            System.out.println(string1  + " is greater than "+ string2);
        } else {
            System.out.println(string1 + " is equal to "+ string2);
        }

        input.close();
    } // main
} // class
