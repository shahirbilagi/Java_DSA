
public class halfPyramidInvertedNumber {

    public static void main(String args[]) {

        // Outer loop
        for (int i = 5; i >= 1; i--) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                // printing coloum
            }
            System.out.println();
            // printing row
        }

        System.out.println("\nOR\n");
        /// ORRRRR
        for (int i = 1; i <= 5; i++) {
            // Inner loop
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print(j + " ");
                // printing coloum
            }
            System.out.println();
            // printing row
        }
    }
}
