import java.util.Scanner;

public class FIRST {

    Scanner Sc = new Scanner(System.in);
    int a,b;
    int c;

    // Enter two numbers.
    void Input()
    {
        System.out.println("Enter any two numbers: ");
        a = Sc.nextInt();
        b = Sc.nextInt();
    }
    void Output()
    {
        System.out.println("The Addition of two numbers is: " +c);
    }

    // Add two numbers.
    void Add()
    {
        c = a + b;
    }

    public static void main(String[] args) {
        FIRST obj = new FIRST();
        obj.Input();
        obj.Add();
        obj.Output();


    }
}
