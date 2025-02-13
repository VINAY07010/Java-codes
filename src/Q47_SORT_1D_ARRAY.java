import java.util.Scanner;

public class Q47_SORT_1D_ARRAY {

    int[] arr;
    int n;
    int i;
    int j;
    int temp;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter the number of elements.
        System.out.println("Enter the number of elements: ");
        n = Sc.nextInt();
        arr = new int[n];

        // Enter the numbers.
        System.out.println("Enter " + n + " numbers: ");
        for(i = 0; i < n; i++)
        {
            arr[i] = Sc.nextInt();
        }
    }
    void Sort_Array(){
        for(i = 0; i< n-1-i; i++){
            for(j=0; j < n-1-i; j++){
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void Output(){
        System.out.println("Array after sorting in ascending order: ");
        for(i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q47_SORT_1D_ARRAY obj = new Q47_SORT_1D_ARRAY();
        obj.Input();
        obj.Sort_Array();
        obj.Output();
    }
}
