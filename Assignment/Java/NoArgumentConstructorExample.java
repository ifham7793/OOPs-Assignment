.public class NoArgumentConstructorExample {
    private String name;
    private int age;

    public NoArgumentConstructorExample() {
         this.name = "Default Name";
        this.age = 0;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        NoArgumentConstructorExample example = new NoArgumentConstructorExample();
        example.displayInfo();
    }
}
