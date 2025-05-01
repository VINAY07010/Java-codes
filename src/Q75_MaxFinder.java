public class Q75_MaxFinder {

    int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    int findMax(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    double findMax(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    double findMax(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Q75_MaxFinder finder = new Q75_MaxFinder();

        System.out.println("Maximum of two integers: " + finder.findMax(5, 10));
        System.out.println("Maximum of three integers: " + finder.findMax(5, 10, 15));
        System.out.println("Maximum of two doubles: " + finder.findMax(5.5, 10.7));
        System.out.println("Maximum of three doubles: " + finder.findMax(5.5, 10.7, 2.3));
    }
}
