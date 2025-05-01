public class Q81_Employee_Hierarchical_Inheritance {

    void Work()
    {
        System.out.println("The Employees are working");
    }
}
class Developer extends Q81_Employee_Hierarchical_Inheritance{
    void code()
    {
        System.out.println("The Developers are working on a code");
    }
}
class Manager1 extends Q81_Employee_Hierarchical_Inheritance{
    void Manage()
    {
        System.out.println("The Manager is managing the team");
    }

    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.work();
        obj.manage();
    }
}
