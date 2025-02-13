import java.util.Scanner;

public class Q49_SORT_5_NAMES {

    String[] names = new String[5];
    int i;
    int j;
    String temp;
    Scanner Sc = new Scanner(System.in);

    void Input(){
        // Enter 5 names.
        System.out.println("Enter 5 names: ");
        for(i = 0; i < 5 ; i++)
        {
            names[i] = Sc.nextLine();
        }
    }
    void Sort_Names(){
        for(i = 0; i < 4; i++){
            for (j = 0; j < 4-i; j++){
                if(names[j].compareTo(names[j + 1]) > 0){
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }
    void Output(){
        System.out.println("Names in ascending order: ");
        for (i = 0; i < 5; i++)
        {
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args) {
        Q49_SORT_5_NAMES obj = new Q49_SORT_5_NAMES();
        obj.Input();
        obj.Sort_Names();
        obj.Output();
    }
}
