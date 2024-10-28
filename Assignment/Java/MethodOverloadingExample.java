.public class MethodOverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
             MethodOverloadingExample example = new MethodOverloadingExample();
        System.out.println("Addition of two integers: " + example.add(5, 10)); // Calls add(int, int)
        System.out.println("Addition of three integers: " + example.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Addition of two doubles: " + example.add(5.5, 10.5)); // Calls add(double, double)
    }
}
