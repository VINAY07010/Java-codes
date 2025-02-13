import java.util.Scanner;
public class Q15_profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the cost price.
        System.out.println(" Enter Cost price: ");
        int cost = sc.nextInt();

        // Enter the sale price.
        System.out.println("Enter sale price: ");
        int sale = sc.nextInt();

        // Calculate the profit.
        int profit = sale - cost;

        System.out.println("The profit is : " + profit);
    }
}