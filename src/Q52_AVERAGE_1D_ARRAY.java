import java.util.Scanner;

public class Q52_AVERAGE_1D_ARRAY {

    int[] arr;
    int n;
    int i;
    int sum;
    double average;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter the number of elements.
        System.out.println("Enter the number of elements: ");
        n = Sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for(i=0; i<n; i++)
        {
            arr[i] = Sc.nextInt();
        }
    }
    void Calculate_Average(){
        sum = 0;
        for(i=0; i<n; i++)
        {
            sum += arr[i];
        }
        average =(double) sum / n;
    }
    void Output(){
        System.out.println("The average (mean) of the array elements is: " + average);
    }

    public static void main(String[] args) {
        Q52_AVERAGE_1D_ARRAY obj = new Q52_AVERAGE_1D_ARRAY();
        obj.Input();
        obj.Calculate_Average();
        obj.Output();
    }
}
