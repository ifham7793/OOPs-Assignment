import java.util.Scanner;
abstract class ThreeDObject {
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}
class Box extends ThreeDObject {
    private double length, width, height;
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
    public double volume() {
        return length * width * height;
    }
}
class Cube extends ThreeDObject {
    private double side;
    public Cube(double side) {
        this.side = side;
    }
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }
    public double volume() {
        return side * side * side;
    }
}
class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends ThreeDObject {
    private double radius, height;
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }
    public double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}
public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length, width, and height of the Box: ");
        Box box = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());
        System.out.print("Enter side length of the Cube: ");
        Cube cube = new Cube(scanner.nextDouble());
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());
        System.out.print("Enter radius and height of the Cylinder: ");
        Cylinder cylinder = new Cylinder(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.print("Enter radius and height of the Cone: ");
        Cone cone = new Cone(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}

