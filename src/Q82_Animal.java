public class Q82_Animal {

    void makeSound()
    {
        System.out.println("Some Sound.");
    }
}
class Dog extends Q82_Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Woof!");
    }
}
class Cat extends Q82_Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Q82_Animal obj = new Q82_Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        obj.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
