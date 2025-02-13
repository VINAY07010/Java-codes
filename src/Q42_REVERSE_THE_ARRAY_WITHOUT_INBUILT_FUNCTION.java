import java.util.Scanner;

public class Q42_REVERSE_THE_ARRAY_WITHOUT_INBUILT_FUNCTION {

        int[] arr = new int[10];
        int i;
        Scanner Sc = new Scanner(System.in);

        void Input(){
            // Enter any 10 numbers.
            System.out.println("Enter any 10 numbers: ");
            for(i=0; i<10; i++ )
            {
                arr[i] = Sc.nextInt();
            }
        }
        void Output(){
            // Entered number in reverse order are:
            System.out.println("The entered numbers in reverse order are: ");
            for(i=9; i>=0; i--)
            {
                System.out.println(arr[i]);
            }
        }

    public static void main(String[] args) {
        Q42_REVERSE_THE_ARRAY_WITHOUT_INBUILT_FUNCTION obj = new Q42_REVERSE_THE_ARRAY_WITHOUT_INBUILT_FUNCTION();
        obj.Input();
        obj.Output();
    }
}
