import java.util.Scanner;

public class Q24_Largest_Among_Three_given_Numbers {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the three numbers.
        System.out.println("Enter the first number: ");
        int num1 = Sc.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = Sc.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = Sc.nextInt();

        int Largest;

        // Find the largest number.
        if (num1 >= num2 && num1 >= num3) {
            Largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            Largest = num2;
        } else {
            Largest = num3;
        }
        // Display the result.
        System.out.println("The Largest number is:" + Largest);
    }
}

