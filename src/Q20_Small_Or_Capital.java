import java.util.Scanner;

public class Q20_Small_Or_Capital {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter an Alphabet.
        System.out.println("Enter a Character: ");
        char ch = Sc.next().charAt(0);

        // Check if the Character is Small or Capital.
        if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Small letter.");
        } else {
            System.out.println(ch+" is a Capital letter.");
        }

    }
}
