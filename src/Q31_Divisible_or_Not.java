import java.util.Scanner;

public class Q31_Divisible_or_Not {

    int num1;
    int num2;

    void Input(){
        // Enter two numbers:
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = Sc.nextInt();

        System.out.println("Enter the second number: ");
        num2 = Sc.nextInt();
    }
    void Check_Divisibility() {
        // Check whether the First number is divisible by Second number or not.
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is not divisible by " + num2);
        }
    }

    public static void main(String[] args) {
        Q31_Divisible_or_Not obj = new Q31_Divisible_or_Not();
        obj.Input();
        obj.Check_Divisibility();
    }
}
