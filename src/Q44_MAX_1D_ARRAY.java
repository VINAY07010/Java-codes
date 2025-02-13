import java.util.Scanner;

public class Q44_MAX_1D_ARRAY {

    int[] arr;
    int n;
    int max;
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
        max = arr[0];
        for(i=1; i<n; i++)
        {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum value in array is: " +max);
    }

    public static void main(String[] args) {
        Q44_MAX_1D_ARRAY obj = new Q44_MAX_1D_ARRAY();
        obj.Input();
        obj.Output();
    }
}
