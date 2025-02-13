import java.util.Scanner;

public class Q43_SUM_OF_ELEMENTS_IN_1_D_ARRAY {

    int[] arr;
    int n;
    int i;
    int sum = 0;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter the number of elements.
        System.out.println("Enter the number of elements: ");
        n = Sc.nextInt();
        arr = new int[n];

        // Enter the numbers.
        System.out.println("Enter " + n + " numbers: ");
        for(i=0; i<n; i++)
        {
            arr[i] = Sc.nextInt();
        }
    }
    void Output(){
        sum = 0;
        System.out.println("The entered numbers are: ");
        for(i=0; i<n; i++)
        {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        System.out.println("The sum of all elements is: " + sum);
    }

    public static void main(String[] args) {
        Q43_SUM_OF_ELEMENTS_IN_1_D_ARRAY obj = new Q43_SUM_OF_ELEMENTS_IN_1_D_ARRAY();
        obj.Input();
        obj.Output();
    }
}
