class MyArithmeticException extends Exception {
    public MyArithmeticException(String message) {
        super(message);
    }
}

public class SimpleCalc {
    public static double calc(double x, double y) throws MyArithmeticException {
        if (y == 0) {
            throw new MyArithmeticException("Division by zero is not allowed.");
        }
        if (x < 0 || y < 0) {
            throw new MyArithmeticException("Negative numbers are not allowed.");
        }
        return (x / y) + (x * y);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + calc(10, 0));
        } catch (MyArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            System.out.println("Result: " + calc(-5, 10));
        } catch (MyArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

