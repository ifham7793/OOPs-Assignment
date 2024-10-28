import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
    }
}
