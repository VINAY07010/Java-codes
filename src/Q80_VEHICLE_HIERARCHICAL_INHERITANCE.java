public class Q80_VEHICLE_HIERARCHICAL_INHERITANCE {

    void start()
    {
        System.out.println("Vehicle Started");
    }
}
class car2 extends Q80_VEHICLE_HIERARCHICAL_INHERITANCE{
    void drive()
    {
        System.out.println("A person is driving a car");
    }
}
class Bike extends Q80_VEHICLE_HIERARCHICAL_INHERITANCE{
    void ride()
    {
        System.out.println("A person is riding a bike");
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.start();
        obj.ride();
    }
}