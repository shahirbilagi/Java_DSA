package Placement_Example;
import java.util.Scanner;
public class Infosys3 {
      public static boolean isTestedOK(int a, int b) {
        return ((a & b) * 2) < (a | b);
    }
    public static int dpfunction(int[] a, int n) {
        int[] dp = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((a[j] < a[i]) && isTestedOK(a[j], a[i])) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            if (dp[i] > count) {
                count = dp[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(dpfunction(a, n));

        scanner.close();
    }
}