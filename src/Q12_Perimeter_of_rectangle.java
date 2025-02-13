import java.util.Scanner;

public class Q12_Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the length of rectangle.
        System.out.println("Enter the length of rectangle: ");
        float length = Sc.nextFloat();

        // Enter the width of rectangle
        System.out.println("Enter the width of rectangle: ");
        float width = Sc.nextFloat();

        // Calculate the Perimeter of Rectangle.
        float perimeter = 2 * (length + width);

        // Display the result.
        System.out.println("The Perimeter of Rectangle is :"+perimeter);



    }
}
