public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // This block will throw a NegativeArraySizeException
            int[] negativeArray = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        try {
            // This block will throw an ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
