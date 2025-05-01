public class Q63_CONSTRUCTOR {
    int a,b;

    Q63_CONSTRUCTOR()
    {
        System.out.println("Constructor is being called");
        a = 10;
        b = 20;
    }
    void output()
    {
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }

    public static void main(String[] args) {
        Q63_CONSTRUCTOR obj = new Q63_CONSTRUCTOR();
        obj.output();
    }
}
