import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int hcf = a;
        int tempB = b;
        while (tempB != 0) {
            int temp = tempB;
            tempB = hcf % tempB;
            hcf = temp;
        }

        int lcm = (a * b) / hcf;
        System.out.println("LCM is: " + lcm);
    }
}
