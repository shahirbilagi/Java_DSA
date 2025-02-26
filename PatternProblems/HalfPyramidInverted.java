
public class HalfPyramidInverted {
    public static void main(String args[]) {

        // Outer loop
        for (int i = 4; i >= 1; i--) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // printing coloum
            }
            System.out.println();
            // printing row
        }

        System.out.println("\nOR\n");
        // OOORRRR
        for (int i = 1; i <= 4; i++) {
            // Inner loop
            for (int j = 1; j <= 4 - i + 1; j++) {
                System.out.print("*");
                // printing coloum
            }
            System.out.println();
            // printing row
        }
    }
}
