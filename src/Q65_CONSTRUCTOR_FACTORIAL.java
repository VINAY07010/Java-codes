import java.util.Scanner;

public class Q65_CONSTRUCTOR_FACTORIAL {

    int num;
    long factorial;

    Q65_CONSTRUCTOR_FACTORIAL()
    {
        // Enter a number
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Sc.nextInt();

        factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
    }
    void Output()
    {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static void main(String[] args) {
        Q65_CONSTRUCTOR_FACTORIAL obj = new Q65_CONSTRUCTOR_FACTORIAL();
        obj.Output();
    }
}
