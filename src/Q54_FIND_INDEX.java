import java.util.Scanner;

public class Q54_FIND_INDEX {

    int[] arr;
    int n;
    int i;
    int target;
    int index = -1;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter the number of elements.
        System.out.println("Enter the number of elements: ");
        n = Sc.nextInt();
        arr = new int[n];

        System.out.println("Enter " + n + " integers: ");
        for(i=0; i<n; i++)
        {
            arr[i] = Sc.nextInt();
        }
        System.out.println("Enter the elements to find: ");
        target = Sc.nextInt();
    }
    void Find_Index(){
        for(i=0; i<n; i++)
        {
            if(arr[i] == target){
                index = i;
                break;
            }
        }
    }
    void Output(){
        if(index == -1)
        {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " is found at index: " + index);
        }
    }

    public static void main(String[] args) {
        Q54_FIND_INDEX obj = new Q54_FIND_INDEX();
        obj.Input();
        obj.Find_Index();
        obj.Output();
    }
}
