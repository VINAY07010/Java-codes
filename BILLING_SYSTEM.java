package JAVA_CHALLENGING_PROBLEMS;

import java.util.Scanner;
class BillingSystem {
    private String customerName;
    private int numItems;
    private double totalBill;
    private double discount;
    private double finalAmount;

    Scanner sc = new Scanner(System.in);

    // Method to take input
    void inputDetails() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter number of items purchased: ");
        numItems = sc.nextInt();

        totalBill = 0;
        for (int i = 1; i <= numItems; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }
    }

    // Method to calculate discount
    void calculateDiscount() {
        if (totalBill > 10000) {
            discount = totalBill * 0.50; // 50% discount for bills above 10000
        } else if (totalBill >= 5000) {
            discount = totalBill * 0.20; // 20% discount for bills between 5000-9999
        } else if (totalBill >= 3000) {
            discount = totalBill * 0.10; // 10% discount for bills between 3000-4999
        } else {
            discount = 0;
        }
        finalAmount = totalBill - discount;
    }

    // Method to display the bill
    void displayBill() {
        System.out.println("\n--- BILL RECEIPT ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Bill Amount: Rs. " + totalBill);
        System.out.println("Discount Applied: Rs. " + discount);
        System.out.println("Final Amount to Pay: Rs. " + finalAmount);
        System.out.println("--------------------");
    }
}

public class BILLING_SYSTEM {
    public static void main(String[] args) {
        BillingSystem customer = new BillingSystem();
        customer.inputDetails();
        customer.calculateDiscount();
        customer.displayBill();
    }
}
