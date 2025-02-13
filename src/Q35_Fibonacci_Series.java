import java.util.Scanner;

public class Q35_Fibonacci_Series {

    int n;
    int first = 0;
    int second = 1;

    void Input() {
        // Enter the number of terms.
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        n = Sc.nextInt();
        Sc.close();
    }

    void Output() {
        System.out.println("Fibonacci series up to " + n + " terms:");
    }

    void Fibonacci_Series() {
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q35_Fibonacci_Series obj = new Q35_Fibonacci_Series();
        obj.Input();
        obj.Output();
        obj.Fibonacci_Series();
    }
}
