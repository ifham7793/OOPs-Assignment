class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    public void showData() {
        System.out.println("This is a vehicle class.");
    }
}
class Bus extends Vehicle {
       private int routeNumber;
    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);  // Calling superclass constructor
        this.routeNumber = routeNumber;
    }
    public void showData() {
        super.showData();  // Calling Vehicle's showData() method
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}
class Car extends Vehicle {
        private String manufacturerName;
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);  // Calling superclass constructor
        this.manufacturerName = manufacturerName;
    }
    public void showData() {
        super.showData();  // Calling Vehicle's showData() method
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus("BUS123", 60, "Blue", "Alice", 10);
        System.out.println("Bus Details:");
        bus.showData(); 
        System.out.println();
        Car car = new Car("CAR456", 120, "Red", "Bob", "Toyota");
        System.out.println("Car Details:");
        car.showData();  
    }
}
