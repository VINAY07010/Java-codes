import java.util.Scanner;

public class Q8_Circumference_Of_Circle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double circumference;
        double radius;
        double PI=3.14159;
        Sc.nextDouble();
        radius = Sc.nextDouble();

        circumference = 2 * PI * radius;
        System.out.println("Circumference = "+circumference);
    }
}

