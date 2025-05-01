public class Q70_CONSTRUCTOR_RECTANGLE {

    double length;
    double width;

    Q70_CONSTRUCTOR_RECTANGLE(double l, double w) // Parameterized constructor.
    {
        length = l;
        width = w;

    }
    void CalculateArea()
    {
        System.out.println("Area: " + (length * width));
    }
    void CalculatePerimeter()
    {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }

    public static void main(String[] args) {
        Q70_CONSTRUCTOR_RECTANGLE obj = new Q70_CONSTRUCTOR_RECTANGLE(5.0,3.0);
        obj.CalculateArea();
        obj.CalculatePerimeter();
    }
}
