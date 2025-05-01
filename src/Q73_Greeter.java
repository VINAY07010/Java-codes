public class Q73_Greeter {

    // Method with no arguments
    void greet()
    {
        System.out.println("Hello, World!");
    }
    // Method with one argument. (String)
    void greet(String name)
    {
        System.out.println("Hello, " + name + "!");
    }
    // Method with Two Arguments. (String and int)
    void greet(String name, int age)
    {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }

    public static void main(String[] args) {
        Q73_Greeter obj = new Q73_Greeter();
        obj.greet();
        obj.greet("Vinay");
        obj.greet("Vinay", 20);
    }
}
