import java.util.Scanner;

public class Q6_Square_and_Cube {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter a number.
        System.out.println("Enter a number :");
        int num = Sc.nextInt();

        // Calculate Sqaure and Cube
        int square = num * num;
        int cube = num * num * num;

        // Display the output.
        System.out.println("The Square of given number is: "+square);
        System.out.println("The Cube of given number is: "+cube);

    }
}
