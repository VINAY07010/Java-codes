package JAVA_CHALLENGING_PROBLEMS;

import java.util.Scanner;

public class Reverse_Number {
    long num;
    long reversed;
    Scanner sc = new Scanner(System.in);

    void inputNumber() {
        System.out.print("Enter a number to reverse: ");
        num = sc.nextLong();
    }

    void reverse() {
        reversed = 0;
        long temp = num;
        while (temp != 0) {
            long digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
    }

    void outputReversed() {
        System.out.println("Reversed number: " + reversed);
    }

    public static void main(String[] args) {
        Reverse_Number obj = new Reverse_Number();
        obj.inputNumber();
        obj.reverse();
        obj.outputReversed();
    }
}
