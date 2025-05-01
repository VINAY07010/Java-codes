package JAVA_CHALLENGING_PROBLEMS;

public class Prime_Numbers {
    int start, end;

    Prime_Numbers(int s, int e)
    {
        start = s;
        end = e;

    }
    boolean isPrime(int num)
    {
        if (num <= 1)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    void printPrimeNumber()
    {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++)
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Prime_Numbers obj = new Prime_Numbers(10, 50);
        obj.printPrimeNumber();
    }
}
