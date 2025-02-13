import java.util.Scanner;

public class Q46_COUNT_THE_OCCURRENCES {

    int[] arr;
    int n;
    int i;
    int element;
    int count;
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
        System.out.println("Enter the element to count: ");
        element = Sc.nextInt();
    }
    void Output(){
        count = 0;

        for(i=0; i<n; i++)
        {
            if(arr[i] == element)
            {
                count++;
            }
        }
        System.out.println("The element " + element + " occurs " + count + " times in the array. ");
    }

    public static void main(String[] args) {
        Q46_COUNT_THE_OCCURRENCES obj = new Q46_COUNT_THE_OCCURRENCES();
        obj.Input();
        obj.Output();
    }
}
