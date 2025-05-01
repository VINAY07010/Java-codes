public class Q76_InterestCalculator {

    // Calculate simple interest for 1 year.
    double calculateInterest(double principal, double rate)
    {
        return (principal * rate * 1) / 100;
    }
    // Calculate simple interest for given time period.
    double calculateInterest(double principal,double rate, double time)
    {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Q76_InterestCalculator obj = new Q76_InterestCalculator();
        System.out.println("Simple Interest for 1 year = " + obj.calculateInterest(10000,5));
        System.out.println("Simple Interest for 2 years = " + obj.calculateInterest(20000,6,2));
    }
}
