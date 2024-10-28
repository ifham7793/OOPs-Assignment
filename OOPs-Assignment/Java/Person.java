public class Person {
    private String name;
    private int age;
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("No-argument constructor called");
    }

       public Person(String name) {
        this.name = name;
        this.age = 0;
        System.out.println("Constructor with name parameter called");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with name and age parameters called");
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
         Person person1 = new Person();
        person1.displayInfo();
        Person person2 = new Person("Alice");
        person2.displayInfo();
        Person person3 = new Person("Bob", 25);
        person3.displayInfo();
    }
}
