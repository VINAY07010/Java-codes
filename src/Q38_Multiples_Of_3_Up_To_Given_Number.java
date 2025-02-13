import java.util.Scanner;

public class Q38_Multiples_Of_3_Up_To_Given_Number {

    int num;

    void Input(){
        // Enter a number.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Sc.nextInt();
    }
    void Output(){
        // Display the result
        System.out.println("Multiples of 3 up to " + num + " is: ");
    }
    void Print_Multiples(){
        for (int i = 3; i <= num; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q38_Multiples_Of_3_Up_To_Given_Number obj = new Q38_Multiples_Of_3_Up_To_Given_Number();
        obj.Input();
        obj.Output();
        obj.Print_Multiples();
    }
}
