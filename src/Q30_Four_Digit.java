import java.util.Scanner;

public class Q30_Four_Digit {

    int num;
    int add;

    void Input(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a four digit number: ");
        num =   Sc.nextInt();
    }
    void Add(){
        int FirstDigit = num / 1000;
        int LastDigit = num % 10;
        add = FirstDigit + LastDigit;
    }
    void Output(){
        System.out.println("The Addition of the First and Last digit of a four digit number is: " +add);
    }

    public static void main(String[] args) {
        Q30_Four_Digit obj = new Q30_Four_Digit();
        obj.Input();
        obj.Add();
        obj.Output();
    }
}
