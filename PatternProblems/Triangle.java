public class Triangle {
    public static void main(String args[]) {

        // Outer loop
        for (int i = 0; i <= 5; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }

                // printing coloum
            }
            System.out.println();
        } // printing row
    }
}
