import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        double median;
        if (n % 2 == 0) {
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            median = numbers[n / 2];
        }

        System.out.println("Median: " + median);
    }
}
