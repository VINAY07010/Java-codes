import java.util.Scanner;

public class Q41_ONE_D_ARRAY {

    int[] arr = new int[10];
    int i;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter any 10 numbers.
        System.out.println("Enter any 10 numbers.");
        for(i=0;i<10;i++)
        {
            arr[i] = Sc.nextInt();
        }
    }

    void Output()
    {
        System.out.println("The entered numbers are: ");
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Q41_ONE_D_ARRAY obj = new Q41_ONE_D_ARRAY();
        obj.Input();
        obj.Output();
    }
}

