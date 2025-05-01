package JAVA_CHALLENGING_PROBLEMS;

import java.util.Scanner;

class BankAccount {
    private double balance;
    private String pin;
    private String accountType;

    BankAccount(double initialBalance, String pin, String accountType) {
        this.balance = initialBalance;
        this.pin = pin;
        this.accountType = accountType;
    }

    boolean authenticate(String enteredPin) {
        return this.pin.equals(enteredPin);
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Previous Balance: Rs." + balance);
            balance += amount;
            System.out.println("Deposited: Rs." + amount + " into " + accountType + " account.");
            System.out.println("Current Balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            System.out.println("Previous Balance: Rs." + balance);
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount + " from " + accountType + " account.");
            System.out.println("Current Balance: Rs." + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    String getAccountType() {
        return accountType;
    }
}

public class ATM_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set your PIN (4 digits only): ");
        String userPin;
        while (true) {
            userPin = sc.nextLine().trim();
            if (userPin.matches("\\d{4}")) {
                break;
            } else {
                System.out.print("Invalid PIN. Enter a valid 4-digit PIN: ");
            }
        }

        System.out.print("Enter initial balance for Savings account: ");
        double savingsBalance = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        BankAccount savingsAccount = new BankAccount(savingsBalance, userPin, "Savings");

        System.out.print("Enter initial balance for Current account: ");
        double currentBalance = sc.nextDouble();
        sc.nextLine(); // consume leftover newline
        BankAccount currentAccount = new BankAccount(currentBalance, userPin, "Current");

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 4) {
                System.out.println("Thank you for using our ATM. Goodbye!");
                sc.close();
                return;
            }

            System.out.print("Enter PIN: ");
            String enteredPin = sc.nextLine().trim();

            if (!savingsAccount.authenticate(enteredPin)) {
                System.out.println("Invalid PIN. Please try again.");
                continue;
            }

            System.out.print("Select Account Type (Savings/Current): ");
            String accountType = sc.nextLine().trim();

            if (!accountType.equalsIgnoreCase("Savings") && !accountType.equalsIgnoreCase("Current")) {
                System.out.println("Invalid account type. Try again.");
                continue;
            }

            BankAccount selectedAccount = accountType.equalsIgnoreCase("Savings") ? savingsAccount : currentAccount;

            switch (choice) {
                case 1:
                    System.out.println("Current Balance in " + selectedAccount.getAccountType() + " account: Rs." + selectedAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    selectedAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    sc.nextLine(); // consume newline
                    selectedAccount.withdraw(withdrawAmount);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
