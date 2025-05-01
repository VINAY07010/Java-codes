public class Q78_VEHICLE_MULTILEVEL_INHERITANCE {

    void start()
    {
        System.out.println("Vehicle Started");
    }
}
    class car1 extends Q78_VEHICLE_MULTILEVEL_INHERITANCE{
        void drive()
        {
            System.out.println("The car is in motion");
        }
    }
    class ElectricCar extends car1{
        void chargeBattery()
        {
            System.out.println("The Electric car is charging");
        }

        public static void main(String[] args) {
            ElectricCar obj = new ElectricCar();
            obj.start();
            obj.drive();
            obj.chargeBattery();
        }

    }

