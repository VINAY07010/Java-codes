import java.util.Scanner;

public class Q34_Table {

    int num;

    void Input(){
        // Enter a number.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Sc.nextInt();
    }
    void Output(){
        // Display the result.
        System.out.println("Table of " + num + ":");
    }
    void Table(){
        for (int i = 1 ; i <= 10; i++)
            System.out.println(num + "x" + i + "=" + (num * i));
    }

    public static void main(String[] args) {
        Q34_Table obj = new Q34_Table();
        obj.Input();
        obj.Output();
        obj.Table();
    }
}

