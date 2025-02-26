public class FloydTriangle {
    public static void main(String args[]) {
        int number = 1;
        // Outer loop
        for (int i = 0; i <= 5; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {

                System.out.print(number + " ");
                number++;
                // printing coloum
            }
            System.out.println();
            // printing row
        }
    }
}