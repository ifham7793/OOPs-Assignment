public class ParameterizedConstructorExample {
    private String name;
    private int age;
    public ParameterizedConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
ParameterizedConstructorExample example = new ParameterizedConstructorExample("Alice", 25);
       	example.displayInfo();
    }
}
