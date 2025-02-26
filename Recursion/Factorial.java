package Recursion;

public class Factorial {
    public static int print(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1=print(n-1);
        int factoriall=n*fact_nm1;
        return factoriall;
    }

    public static void main(String args[]) {
        int n = 5;
        int fact = print(n);
        System.out.println(fact);
    }
}
