class Parent {
    public static void display() {
     System.out.println("Static method in Parent class");
 }
     public void show() {
     System.out.println("Non-static method in Parent class");
 }
}
class Child extends Parent {
  public static void display() {
     System.out.println("Static method in Child class");
 }
 public void show() {
     System.out.println("Non-static method in Child class");
 }
}
public class MethodHidingExample {
 public static void main(String[] args) {
     Parent parent = new Parent();
     parent.display();  
     parent.show();     
     Child child = new Child();
     child.display();     
  child.show();     
      Parent parentRefChild = new Child();
     parentRefChild.display();  
    parentRefChild.show();  
 }
}
