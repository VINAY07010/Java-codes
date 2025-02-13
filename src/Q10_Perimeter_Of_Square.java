import java.util.Scanner;

public class Q10_Perimeter_Of_Square {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the side length of square.
        System.out.println("Enter the side length of square: ");
        float side = Sc.nextFloat();

        // Calculate the perimeter of square.
        float perimeter = 4 * side;

        // Display the result.
        System.out.println("The perimeter of square is: "+perimeter);
    }
}
