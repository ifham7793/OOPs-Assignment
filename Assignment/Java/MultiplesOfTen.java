import java.util.Scanner;

public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start and end of interval: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println("Multiples of 10 in the given range:");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

