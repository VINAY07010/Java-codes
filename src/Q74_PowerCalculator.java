public class Q74_PowerCalculator {

    int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    int power(int base) {
        return base * base;
    }

    public static void main(String[] args) {
        Q74_PowerCalculator calculator = new Q74_PowerCalculator();

        System.out.println("Base^Exponent (int) = " + calculator.power(2, 3));
        System.out.println("Base^Exponent (double) = " + calculator.power(2.5, 3));
        System.out.println("Base^2 (int) = " + calculator.power(4));
    }
}
