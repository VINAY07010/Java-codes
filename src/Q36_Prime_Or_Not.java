import java.util.Scanner;

public class Q36_Prime_Or_Not {

    int num;

    void Input(){
        // Enter a number.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Sc.nextInt();
    }
    void Output(){
        // Display the result.
        System.out.println("The number " + num + " is ");
    }
    void Prime_Or_Not() {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("a prime number. ");
        } else {
            System.out.println("not a prime number. ");
        }
    }

    public static void main(String[] args) {
        Q36_Prime_Or_Not obj = new Q36_Prime_Or_Not();
        obj.Input();
        obj.Output();
        obj.Prime_Or_Not();
    }
}
