
public class HollowRectangle {

    public static void main(String args[]) {

        // Outer loop
        for (int i = 1; i <= 4; i++) {
            // Inner loop
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                // printing coloum
            }
            System.out.println();
            // printing row
        }
    }

}
