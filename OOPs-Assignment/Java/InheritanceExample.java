class Person {
    protected String name;
   protected int age;
   public Person(String name, int age) {
       this.name = name;
       this.age = age;
   }
   public void displayInfo() {
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
   }
}
class Employee extends Person {
    private String emp_id;
   private double salary;
   public Employee(String name, int age, String emp_id, double salary) {
       super(name, age);  
       this.emp_id = emp_id;
       this.salary = salary;
   }
   public void displayEmployeeInfo() {
         super.displayInfo();
        System.out.println("Employee ID: " + emp_id);
       System.out.println("Salary: " + salary);
   }
}
public class InheritanceExample {
   public static void main(String[] args) {
Employee employee = new Employee("Alice", 30, "E12345", 55000);             employee.displayEmployeeInfo();
   }
}
