import java.util.Scanner;

public class Q45_MIN_1D_ARRAY {

    int[] arr;
    int n;
    int min;
    int i;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter the number of elements.
        System.out.println("Enter the number of elements: ");
        n = Sc.nextInt();
        arr = new int[n];

        // Enter the numbers.
        System.out.println("Enter " + n + " numbers : ");
        for(i=0; i<n; i++)
        {
            arr[i] = Sc.nextInt();
        }
    }
    void Output(){
        min = arr[0];
        for(i=1; i<n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("The minimum value in the array is: " +min);
    }

    public static void main(String[] args) {
        Q45_MIN_1D_ARRAY obj =new Q45_MIN_1D_ARRAY();
        obj.Input();
        obj.Output();
    }
}
