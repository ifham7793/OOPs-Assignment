public class PatternA {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
