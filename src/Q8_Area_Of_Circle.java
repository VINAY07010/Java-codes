import java.util.Scanner;

public class Q8_Area_Of_Circle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double area;
        double radius;
        double PI=3.14159;
        Sc.nextFloat();
        radius=Sc.nextFloat();

        area = PI * radius * radius;
        System.out.println("area="+area);

    }
}
