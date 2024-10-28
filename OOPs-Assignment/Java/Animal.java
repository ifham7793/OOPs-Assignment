class Animal {
    public void display() {
      System.out.println("This is an animal.");
  }
}

class Mammal extends Animal {
     public void display() {
      super.display(); // Call to the parent class method
      System.out.println("This is a mammal.");
  }
}

// Derived class Dog that inherits from Mammal
class Dog extends Mammal {
  // Method to display information about dogs
  public void display() {
      super.display(); // Call to the parent class method
      System.out.println("This is a dog.");
  }
}

// Main class to test multilevel inheritance
public class MultilevelInheritanceTest {
  public static void main(String[] args) {
      // Create a Dog object
      Dog dog = new Dog();
      
      // Call the display method
      dog.display();
  }
}

