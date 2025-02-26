package Recursion;

public class Calpower {
    public static int Cal(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xpownum = Cal(x, n - 1);
        int xpow = x * xpownum;
        return xpow;
    }

    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = Cal(x, n);
        System.out.println(ans);
    }
}
