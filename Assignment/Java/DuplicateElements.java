import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequency:");
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > 1) {
                System.out.println(key + " occurs " + frequencyMap.get(key) + " times");
            }
        }
    }
}

