import java.util.Scanner;

public class Q13_Days_To_Month {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Take input from user.
        System.out.println("Enter the number of days: ");
        int days = Sc.nextInt();

        // Convert days to months and remaining days
        int months = days / 30;
        int remainingdays = days % 30;

        // Display the result.
        System.out.println("Equivalent duration: " + months + " month(s) and " + remainingdays + " day(s)");
    }
}
