public class StaticDemo {
    static int count = 0;  // Static variable to keep same count of objects created
    
    public StaticDemo() { // Constructor to increment count when a new object is created
        count++;
    }
    
    public static void displayCount() { // Static method to display the current count
        System.out.println("Count of objects created: " + count);
    }

    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        
        StaticDemo.displayCount(); // Output should be 2 since two objects are created
    }
}

