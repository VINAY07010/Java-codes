import java.util.Scanner;

public class Q37_Even_Number_Up_to_Given_Number {

    int num;

    void Input() {
        // Enter a number.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Sc.nextInt();
    }
    void Output(){
        // Display the result.
        System.out.println("Even numbers up to " + num + ":");
    }
    void Print_Even_Numbers(){
        for (int i = 2; i <= num; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q37_Even_Number_Up_to_Given_Number obj = new Q37_Even_Number_Up_to_Given_Number();
        obj.Input();
        obj.Output();
        obj.Print_Even_Numbers();
    }
}
