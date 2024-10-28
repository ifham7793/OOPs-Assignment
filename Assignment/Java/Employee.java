import java.util.Scanner; 

public class Employee {
    private int emp_id; 						
    private String emp_name; 					
    private double basic_salary; 

    // Constructor to initialize the Employee object with ID, Name and Salary
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id; 
        this.emp_name = emp_name; 
        this.basic_salary = basic_salary; 
    }

    // Method to calculate and return the gross salary
    public double calculateGrossSalary() {
        double hra = basic_salary * 0.10; 		// House Rent Allowance is 10% of basic salary
        double da = basic_salary * 0.05; 		// Dearness Allowance is 5% of basic salary
        return basic_salary + hra + da; 		// Gross Salary is the sum of basic, HRA, and DA
    }

   
    public void displayDetails() {
        System.out.println("Employee ID: " + emp_id); 			// Display employee ID
        System.out.println("Employee Name: " + emp_name); 		// Display employee name
        System.out.println("Basic Salary: " + basic_salary); 		// Display basic salary
        System.out.println("Gross Salary: " + calculateGrossSalary());   // Display gross salary
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
   System.out.print("Enter Employee ID: ");
        int emp_id = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        String emp_name = scanner.nextLine(); 
        System.out.print("Enter Basic Salary: ");
        double basic_salary = scanner.nextDouble(); 
        
        // Creating an Employee object with the provided details
        Employee employee = new Employee(emp_id, emp_name, basic_salary);

        // Displaying the employee details and gross salary
        employee.displayDetails();
        
        scanner.close(); 
    }
}
