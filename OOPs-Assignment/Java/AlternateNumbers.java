import java.util.Scanner;

public class AlternateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Every alternate number: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
