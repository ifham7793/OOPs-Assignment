import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks in Mathematics, Physics, and Chemistry: ");
        int math = scanner.nextInt();
        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();

        int total = math + physics + chemistry;
        int mathPhysicsTotal = math + physics;

        if ((math >= 60 && physics >= 50 && chemistry >= 40 && total >= 200) || (mathPhysicsTotal >= 150)) {
            System.out.println("Eligible for admission.");
        } else {
            System.out.println("Not eligible for admission.");
        }
    }
}
