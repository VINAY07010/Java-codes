import java.util.Scanner;

public class Q51_NEGATIVE_TO_ZERO_1D_ARRAY {

    int[] arr;
    int n;
    int i;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter number of elements.
        System.out.println("Enter the number of elements: ");
        n = Sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for(i=0; i<n; i++)
        {
            arr[i] = Sc.nextInt();
        }
    }
    void Replace_negatives(){
        for(i=0; i<n; i++)
        {
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
    }
    void Output(){
        System.out.println("Modified array: ");
        for(i=0; i<n; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q51_NEGATIVE_TO_ZERO_1D_ARRAY obj = new Q51_NEGATIVE_TO_ZERO_1D_ARRAY();
        obj.Input();
        obj.Replace_negatives();
        obj.Output();
    }
}
