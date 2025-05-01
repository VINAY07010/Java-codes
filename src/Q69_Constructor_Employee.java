public class Q69_Constructor_Employee {

    String name;
    double salary;

    Q69_Constructor_Employee() // This is a default constructor.
    {
        name = "";
        salary = 0.0;
    }
    Q69_Constructor_Employee(String n, double s) // This is a parameterized constructor.
    {
        name = n;
        salary = s;
    }
    void Output()
    {
        System.out.println("Name: " + name);
        System.out.println("Salary:Rs " + salary);
    }

    public static void main(String[] args) {
        Q69_Constructor_Employee obj1 = new Q69_Constructor_Employee();
        Q69_Constructor_Employee obj2 = new Q69_Constructor_Employee("ABC", 60000);

        System.out.println("Default Employee");
        obj1.Output();
        System.out.println();

        System.out.println("Parameterized Employee");
        obj2.Output();

    }
}
