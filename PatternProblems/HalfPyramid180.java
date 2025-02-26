
public class HalfPyramid180 {
    public static void main(String args[]) {

        // Outer loop
        for (int i = 1; i <= 4; i++) {
            // Inner loop
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // printing coloum
            System.out.println();
            // printing row
        }
    }
}