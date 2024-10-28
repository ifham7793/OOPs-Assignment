class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class Candidate {
    private String name;
    private int age;

    public Candidate(String name, int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        try {
            Candidate c = new Candidate(name, age);
            System.out.println("Candidate created successfully: " + name + ", Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}


