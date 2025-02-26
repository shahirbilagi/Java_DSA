package Placement_Example;
public class kadane {
    public static void main(String args[]) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int min_sum = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (min_sum < sum) {
                min_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("LCS:" + min_sum);
    }
}