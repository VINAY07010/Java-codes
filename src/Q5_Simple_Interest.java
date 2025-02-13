import java.util.Scanner;

public class Q5_Simple_Interest {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the Principal amount.
        System.out.println("Enter the Principal amount: ");
        int prin_amount = Sc.nextInt();

        // Enter the Rate of Interest.
        System.out.println("Enter the Rate of Interest: ");
        float rate_of_int = Sc.nextFloat();

        // Enter No. of years.
        System.out.println("Enter no. of years: ");
        float no_of_yrs = Sc.nextFloat();

        // Calculate simple interest
       float simpleinterest = (float) (prin_amount * rate_of_int * no_of_yrs) / 100;

       // Calculate final amount (Total amount to be paid).
        float finalamount = (float) prin_amount + simpleinterest;

       // Display the output.
        System.out.println("The simple interest is: "+simpleinterest);
        System.out.println("The final amount paid to the bank is: "+finalamount);
    }
}
