import java.util.Scanner;

public class Q3_ADD_SUB_MUL_DIV {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the first number.
        System.out.println("Enter the first number: ");
        int num1 = Sc.nextInt();

        // Enter the second number.
        System.out.println("Enter the second number: ");
        int num2 = Sc.nextInt();

        // calculate
        int add = num1 + num2;
        int sub = num1 - num2;
        float mul = (float) num1 * num2;
        float div = (float) num1 /num2;

        // Display the result.
        System.out.println("The Addition of two numbers is: "+ add);
        System.out.println("The Subtraction of two numbers is :"+sub);
        System.out.println("The Multiplication of two numbers is :"+mul);
        System.out.println("The Division of two numbers is :"+div);


    }
}
