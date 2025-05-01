public class Q72_Shape {

    // Function Overloading.

    // Calculate the area of square.
    int area(int side)
    {
        return side * side;
    }
    // Calculate the area of rectangle.
    int area(int length, int width)
    {
        return length * width;
    }
    // Calculate the area of circle.
    double area(double radius)
    {
        return 3.14159 * radius * radius; // Here 3.14159 is the value of PI.
    }

    public static void main(String[] args) {
        Q72_Shape obj = new Q72_Shape();
        System.out.println("Area of Square = " + obj.area(10));
        System.out.println("Area of Rectangle = " + obj.area(12,16));
        System.out.println("Area of Circle = " + obj.area(6.2));
    }
}
