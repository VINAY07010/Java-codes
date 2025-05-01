import java.util.Scanner;

public class TWO_INTEGER_DIVISION {

    int num1;
    int num2;

    void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator: ");
        num1 = sc.nextInt();

        System.out.println("Enter the denominator: ");
        num2 = sc.nextInt();
    }

    void PerformDivision() {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero. This would cause an ArithmeticException.");
        } else {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        TWO_INTEGER_DIVISION obj = new TWO_INTEGER_DIVISION();
        obj.Input();
        obj.PerformDivision();
    }
}
