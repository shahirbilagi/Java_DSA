package FunctionProblems;

import java.util.Scanner;

public class SumODD {
    public static void Sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;

            }
        }
        System.out.println(sum);
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the N value:");
        int n = sc.nextInt();
        Sum(n);
    }
}
