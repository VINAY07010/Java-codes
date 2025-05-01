package JAVA_CHALLENGING_PROBLEMS;

import java.util.Scanner;

public class MenuDriven_1D_Array {
    int[] arr;
    int n;
    Scanner sc = new Scanner(System.in);

    void inputArray() {
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    int findMinimum() {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    int findMaximum() {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    void sortArray() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    int findSum() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    double findAverage() {
        return (double) findSum() / n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuDriven_1D_Array obj = new MenuDriven_1D_Array();
        int choice;
        
        obj.inputArray();
        
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Find Minimum");
            System.out.println("2. Find Maximum");
            System.out.println("3. Sort Array");
            System.out.println("4. Find Sum");
            System.out.println("5. Find Average");
            System.out.println("6. Sort and Display Array");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Minimum element: " + obj.findMinimum());
                    break;
                case 2:
                    System.out.println("Maximum element: " + obj.findMaximum());
                    break;
                case 3:
                    obj.sortArray();
                    break;
                case 4:
                    System.out.println("Sum of elements: " + obj.findSum());
                    break;
                case 5:
                    System.out.println("Average of elements: " + obj.findAverage());
                    break;
                case 6:
                    obj.sortArray();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);
        
        sc.close();
    }
}
