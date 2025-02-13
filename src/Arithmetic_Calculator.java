import java.util.Scanner;

public class Arithmetic_Calculator {

    double num1;
    double num2;
    double C;
    int choice;

    void Input() {
        // Enter two numbers.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        num1 = Sc.nextDouble();
        System.out.println("Enter Second number: ");
        num2 = Sc.nextDouble();
        System.out.println("Choose operation of your choice: ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        choice = Sc.nextInt();
    }

    void Addition() {
        // Add Two Numbers.
        C = num1 + num2;
        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + C);
    }

    void Subtraction() {
        // Subtract Two Numbers.
        C = num1 - num2;
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + C);
    }

    void Multiplication(){
        // Multiply Two Numbers.
        C = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + C);
    }
    void Division(){
        C = num1 / num2;
        System.out.println("Division of " + num1 + " and " + num2 + " is: " + C);
    }
    void Modulus(){
        C = num1 % num2;
        System.out.println("Modulus of " + num1 + " and " + num2 + " is: " + C);
    }

    public static void main(String[] args) {
        Arithmetic_Calculator obj = new Arithmetic_Calculator();
        obj.Input();
        switch (obj.choice) {
            case 1:
                obj.Addition();
                break;
            case 2:
                obj.Subtraction();
                break;
            case 3:
                obj.Multiplication();
                break;
            case 4:
                obj.Division();
                break;
            case 5:
                obj.Modulus();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}




