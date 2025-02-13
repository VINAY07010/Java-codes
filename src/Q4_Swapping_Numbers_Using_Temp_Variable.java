import java.util.Scanner;

public class Q4_Swapping_Numbers_Using_Temp_Variable {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter first number.
        System.out.println("Enter the first number:");
        int num1 = Sc.nextInt();

        // Enter the second number.
        System.out.println("Enter the second number:");
        int num2 = Sc.nextInt();

        // Display Before Swapping.
        System.out.println("Before Swapping:");
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);

        // Swap the numbers using temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display After Swapping.
        System.out.println("After Swapping:");
        System.out.println("First number :"+num1);
        System.out.println("Second number :"+num2);

    }
}
