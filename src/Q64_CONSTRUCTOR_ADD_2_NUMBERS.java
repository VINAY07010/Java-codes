import java.util.Scanner;

public class Q64_CONSTRUCTOR_ADD_2_NUMBERS {

    int num1;
    int num2;
    int add;

    Q64_CONSTRUCTOR_ADD_2_NUMBERS()
    {
        // Enter any two numbers
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        num1 = Sc.nextInt();
        num2 = Sc.nextInt();

        // Add two numbers
        add = num1 + num2;
    }
    void Output()
    {
        System.out.println("The addition of two number is: " +add);
    }

    public static void main(String[] args) {
        Q64_CONSTRUCTOR_ADD_2_NUMBERS obj = new Q64_CONSTRUCTOR_ADD_2_NUMBERS();
        obj .Output();
    }
}
