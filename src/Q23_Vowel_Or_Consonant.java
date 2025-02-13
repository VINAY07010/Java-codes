import java.util.Scanner;

public class Q23_Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter an Alphabet.
        System.out.println("Enter an Alphabet: ");
        char ch = Sc.next().charAt(0);

        // Convert to small letter to simplify checking
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid Input! Please enter an Alphabet.");
        }
    }
}