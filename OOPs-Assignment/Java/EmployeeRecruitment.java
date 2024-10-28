class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {
    public static void main(String[] args) {
        try {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Enter candidate name: ");
            String name = scanner.nextLine();

            System.out.print("Enter candidate age: ");
            int age = scanner.nextInt();

            checkEligibility(name, age);
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Please enter a valid number for age.");
        }
    }

    public static void checkEligibility(String name, int age) throws TooOlderException, TooYoungerException {
        if (age > 45) {
            throw new TooOlderException("Candidate " + name + " is too old.");
        } else if (age < 20) {
            throw new TooYoungerException("Candidate " + name + " is too young.");
        } else {
            System.out.println("Eligible: " + name);
        }
    }
}

