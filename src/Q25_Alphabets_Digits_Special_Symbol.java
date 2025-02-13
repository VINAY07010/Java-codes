import java.util.Scanner;
public class Q25_Alphabets_Digits_Special_Symbol {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter a Character.
        System.out.println("Enter a character: ");
        char ch = Sc.next().charAt(0);

        // Check whether the character is an Alphabet, Digit, or Special Symbol.
        if(Character.isAlphabetic(ch)) {
            System.out.println(ch + " is an Alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Symbol.");

        }
    }
}

