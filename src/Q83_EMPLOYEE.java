public class Q83_EMPLOYEE {

    void getSalary()
    {
        System.out.println("Base Salary: $30,000");
    }
}
class MANAGER extends Q83_EMPLOYEE
{
    @Override
    void getSalary()
    {
        System.out.println("Base Salary + $50,000");
    }
}
class DEVELOPER extends Q83_EMPLOYEE
{
    @Override
    void getSalary()
    {
        System.out.println("Base Salary + $45,000");
    }

    public static void main(String[] args) {
        Q83_EMPLOYEE obj = new Q83_EMPLOYEE();
        MANAGER m = new MANAGER();
        DEVELOPER d = new DEVELOPER();

        obj.getSalary();
        m.getSalary();
        d.getSalary();
    }
}
