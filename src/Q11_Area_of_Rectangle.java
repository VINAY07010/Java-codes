import java.util.Scanner;
public class Q11_Area_of_Rectangle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // Enter the length of rectangle.
        System.out.println("Enter the length of rectangle: ");
        float length = Sc.nextFloat();

        // Enter the width of rectangle.
        System.out.println("Enter the width of rectangle: ");
        float width = Sc.nextFloat();

        // Calculate the Area of rectangle.
        float area = length * width;

        // Display the result.
        System.out.println("The Area of Rectangle is: "+area);
    }
}
