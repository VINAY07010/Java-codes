import java.util.Scanner;

public class Q18_Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the number.
        System.out.println("Enter a number: ");
        int num = Sc.nextInt();

        // Check whether the given number is positive or negative
        if (num >= 0) {
            System.out.println("The given number is Positive.");
        } else {
            System.out.println("The given number is Negative.");
        }
    }
}