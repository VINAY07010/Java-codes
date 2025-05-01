public class This_Keyword {

    int num1, num2;

    void Input(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    void Output()
    {
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }

    public static void main(String[] args) {
        This_Keyword obj = new This_Keyword();
        obj.Input(100,500);
        obj.Output();
    }
}
