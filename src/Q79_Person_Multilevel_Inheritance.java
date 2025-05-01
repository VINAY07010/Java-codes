public class Q79_Person_Multilevel_Inheritance {

    void speak()
    {
        System.out.println("The person is speaking");
    }
}
class Employee extends Q79_Person_Multilevel_Inheritance{
    void work()
    {
        System.out.println("The employee is working");
    }
}
class Manager extends Employee {
    void manage() {
        System.out.println("The Manager is managing the team");
    }

    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.speak();
        obj.work();
        obj.manage();
    }
}
