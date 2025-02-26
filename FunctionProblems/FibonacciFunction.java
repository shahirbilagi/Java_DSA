package FunctionProblems;

import java.util.Scanner;

public class FibonacciFunction {
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.println(a + " ");
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.println(b + " ");
                int temp = b;
                b = a + b;
                a = temp;

            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth value:");
        int n = sc.nextInt();
        fibonacci(n);
    }
}
