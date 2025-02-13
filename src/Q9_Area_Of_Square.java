import java.util.Scanner;

public class Q9_Area_Of_Square {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the side length of the square:");
        float area;
        float side;
        Sc.nextFloat();
        side = Sc.nextFloat();

        area = side * side;
        System.out.println("Area = "+ area);
    }
}
