public class cal {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int multiply(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        cal calculator = new cal();

        System.out.println("Addition (2 numbers): " + calculator.add(10, 5));
        System.out.println("Addition (3 numbers): " + calculator.add(10, 5, 3));

        System.out.println("Subtraction (2 numbers): " + calculator.subtract(20.5, 8.5));
        System.out.println("Subtraction (3 numbers): " + calculator.subtract(20.5, 8.5, 2.0));

        System.out.println("Multiplication (2 numbers): " + calculator.multiply(5, 4));
        System.out.println("Multiplication (3 numbers): " + calculator.multiply(5, 4, 2));
    }
}
