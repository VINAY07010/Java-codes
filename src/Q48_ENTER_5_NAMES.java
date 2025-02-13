import java.util.Scanner;

public class Q48_ENTER_5_NAMES {

    String[] names = new String[5];
    int i;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter 5 names.
        System.out.println("Enter 5 names: ");
        for(i = 0; i < 5; i++)
        {
            names[i] = Sc.nextLine();
        }
    }
    void Output(){
        System.out.println("The entered names are: ");
        for(i = 0; i < 5; i++)
        {
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args) {
        Q48_ENTER_5_NAMES obj = new Q48_ENTER_5_NAMES();
        obj.Input();
        obj.Output();
    }
}
