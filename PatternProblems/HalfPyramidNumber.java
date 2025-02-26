
public class HalfPyramidNumber {
    public static void main(String args[]) {

        // Outer loop
        for (int i = 1; i <= 4; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                // printing coloum
            }
            System.out.println();
            // printing row
        }
    }
}