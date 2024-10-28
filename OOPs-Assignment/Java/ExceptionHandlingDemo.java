// Class that demonstrates exception handling
public class ExceptionHandlingDemo {

    // Method that throws an exception
    public static void riskyMethod() throws ArithmeticException {
        throw new ArithmeticException("Division by zero is not allowed"); // Using throw keyword to throw an exception
    }

    public static void main(String[] args) {
        try {
            riskyMethod(); // Calling a method that can throw an exception
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // Finally block always executes
            System.out.println("This is the finally block. It always executes.");
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            // Finally block always executes
            System.out.println("This is the finally block. It always executes.");
        }
    }
}

