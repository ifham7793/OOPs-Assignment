class Num {
    protected int number;
 public Num(int number) {
     this.number = number;
 }
 public void showNum() {
     System.out.println("Decimal Number: " + number);
 }
}

class HexNum extends Num {
 public HexNum(int number) {
     super(number);
 }
 public void showNum() {
     System.out.println("Decimal Number: " + number);
     System.out.println("Hexadecimal Value: " + Integer.toHexString(number).toUpperCase());
     System.out.println("Octal Value: " + Integer.toOctalString(number));
 }
}
public class NumTest {
 public static void main(String[] args) {
     Num num = new Num(42);
     System.out.println("Using Num class:");
     num.showNum();
     System.out.println();
     HexNum hexNum = new HexNum(42);
     System.out.println("Using HexNum class:");
     hexNum.showNum();
 }
}
