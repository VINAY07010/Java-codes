import java.util.Scanner;

public class Q33_Factorial {

    int num;
    long factorial;

    void Input(){
        // Enter a number.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Sc.nextInt();
    }
    void Factorial(){
        factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
    }
    void Output(){
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static void main(String[] args) {
        Q33_Factorial obj = new Q33_Factorial();
        obj.Input();
        obj.Factorial();
        obj.Output();
    }
}
