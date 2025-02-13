import java.util.Scanner;

public class Q32_Profit_or_Loss {

    int cost;
    int sale;
    int amount;

    void Input(){
        // Enter the Cost and Sale Price.
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price: ");
        cost = Sc.nextInt();

        System.out.println("Enter Sale Price: ");
        sale = Sc.nextInt();
    }
    void Calculate(){
        // Calculate Profit or Loss.
        amount = sale - cost;
        if(sale > cost){
            System.out.println("Profit: " + amount);
        } else {
            System.out.println("Loss: " + amount);
        }
    }

    public static void main(String[] args) {
        Q32_Profit_or_Loss obj = new Q32_Profit_or_Loss();
        obj.Input();
        obj.Calculate();
    }
}

