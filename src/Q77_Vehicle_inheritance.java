public class Q77_Vehicle_inheritance {

    void start()
    {
        System.out.println("Vehicle Started");
    }
}
class car extends Q77_Vehicle_inheritance{
     void drive()
     {
         System.out.println("The car is in motion");
     }

    public static void main(String[] args) {
        car obj = new car();
        obj.start();
        obj.drive();
    }
}
