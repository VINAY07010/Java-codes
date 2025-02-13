import java.util.Scanner;

public class Q29_Simple_Interest {
    int prin_amt;
    float rate_of_int;
    int no_of_yrs;
    float simpleinterest;
    float finalamount;

    void Input(){
        Scanner Sc = new Scanner(System.in);
        // Enter the Principal amount.
        System.out.println("Enter the principal amount: ");
        prin_amt = Sc.nextInt();

        // Enter Rate of Interest.
        System.out.println("Enter Rate of Interest: ");
        rate_of_int = Sc.nextFloat();

        // Enter Number of Years.
        System.out.println("Enter Number of Years: ");
        no_of_yrs = Sc.nextInt();
    }
    void Calculate(){
        // Calculate Simple interest.
        simpleinterest = (prin_amt * rate_of_int * no_of_yrs) / 100;

        // Calculate Final amount(Total amount to be paid.)
        finalamount = prin_amt + simpleinterest;
    }
    void Output(){
        // Display the result.
        System.out.println("The Simple Interest is: " +simpleinterest);
        System.out.println("The Final Amount paid to the bank is: " +finalamount);
    }

    public static void main(String[] args) {
        Q29_Simple_Interest obj = new Q29_Simple_Interest();
        obj.Input();
        obj.Calculate();
        obj.Output();
    }
}
