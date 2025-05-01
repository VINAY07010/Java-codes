public class Q71_Calculator {

    // Function Overloading.
    int sum(int x, int y)
    {
        return x + y;
    }
    int sum(int x, int y, int z)
    {
        return x + y + z;
    }
    double sum(double x, double y)
    {
        return x + y;
    }

    public static void main(String[] args) {
        Q71_Calculator obj = new Q71_Calculator();
        System.out.println("Sum of Two Integers = " + obj.sum(5,10));
        System.out.println("Sum of Three Integers = " + obj.sum(10,20,30));
        System.out.println("Sum of TwO Doubles = " + obj.sum(5.5,2.3));
    }
}
