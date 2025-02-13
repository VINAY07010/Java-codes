import java.util.Scanner;

public class Q16_Eligible_To_Vote {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the age of voter.
        System.out.println("Enter your Age: ");
        int age = Sc.nextInt();

        // Check whether the person is eligible to vote or not.
        if(age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not elgible to vote:");
        }
    }
}
