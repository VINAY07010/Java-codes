public class Q68_CONSTRUCTOR_BOOK {

    String title;
    String author;
    double price;

    Q68_CONSTRUCTOR_BOOK()// This is a default constructor.
    {
        title = "";
        author = "";
        price = 0.0;
    }
    Q68_CONSTRUCTOR_BOOK(String t, String a, double p) // This is a parameterized constructor.
    {
        title = t;
        author = a;
        price = p;
    }
    void Output()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : Rs " + price);
    }

    public static void main(String[] args) {
        Q68_CONSTRUCTOR_BOOK obj1 = new Q68_CONSTRUCTOR_BOOK();
        Q68_CONSTRUCTOR_BOOK obj2 = new Q68_CONSTRUCTOR_BOOK("Rich dad Poor dad", "Robert kiyosaki", 299.99);

        System.out.println("Default Book: ");
        obj1.Output();
        System.out.println();

        System.out.println("Parameterized Book: ");
        obj2.Output();

    }
    
}
