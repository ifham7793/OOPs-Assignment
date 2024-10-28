public class Person_this {
    private String name;
    private int age;

        public Person(String name, int age) {
        this.name = name;        // 'this' keyword distinguishes instance variables from parameters
        this.age = age;       
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name); // Using 'this' to refer to instance variables
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        Person p = new Person("John Doe", 30); 
        p.displayDetails(); 
    }
}
