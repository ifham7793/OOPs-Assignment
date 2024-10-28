import java.util.Scanner;

public class ConsecutiveDigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = scanner.next();

        int sum = 0; // Variable to store the sum of the numbers formed by consecutive digits
        
        for (int i = 0; i < input.length() - 1; i++) {  // Iterate through the digits of the number
            String consecutiveDigits = input.substring(i, i + 2);  // Form a number using consecutive digits
            sum += Integer.parseInt(consecutiveDigits); // Convert to integer and add to the sum
        }
        
        System.out.println("Sum of consecutive digits numbers: " + sum);
        scanner.close(); 
    }
}
