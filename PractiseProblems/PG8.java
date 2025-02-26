package PractiseProblems;

public class PG8 {
    public static void main(String args[]) {
        int[] shahir = { 44, 35, 34, 51, 63, 47 };
        System.out.println("Length of shahir is:" + shahir.length);
        for (int i = 0; i < shahir.length - 1; i++) {
            for (int j = 0; j < shahir.length - 1; j++) {
                if (shahir[j] > shahir[j + 1]) {
                    int temp = shahir[j + 1];
                    shahir[j + 1] = shahir[j];
                    shahir[j] = temp;
                }
            }
        }
        System.out.print("The sorted array is:");
        for (int i = 0; i < shahir.length; i++) {
            System.out.print(shahir[i] + " ");
        }

    }
}
