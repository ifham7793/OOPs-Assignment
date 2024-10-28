import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: " + decimal);

        System.out.print("Enter a decimal number: ");
        int decNumber = scanner.nextInt();
        System.out.println("Decimal to Binary: " + Integer.toBinaryString(decNumber));
    }
}

